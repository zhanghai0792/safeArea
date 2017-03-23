package servicesDao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import dao.newsMapper;
import dao.query.newsQueryParams;
import dao.query.photoQueryParams;
import pojo.area;
import pojo.news;
@Service
public class newsServiceDao extends serviceDaoTemplate<news, newsMapper,newsQueryParams>{

	@Override
	public int save(news record) throws Exception {
		int count=super.save(record);
		super.savePhoto(record.getPhotos(), record,record.photoType);
		return count;
	}

	@Override
	public int updateNoNull(news record) throws Exception {
		int count=super.updateNoNull(record);
		 super.savePhoto(record.getPhotos(), record,record.photoType);
		return count;
	}

	@Override
	public int delete(news record) throws Exception {
		photoQueryParams photoQuery=new photoQueryParams();
		photoQuery.setFk(record.getId());
		photoQuery.setType(area.photoType);
		photoMapper.deletePhotos(photoQuery);
		return super.delete(record);
	}

	@Override
	public int updateAll(news record) throws Exception {
		int count=super.updateAll(record);
		 super.savePhoto(record.getPhotos(), record,record.photoType);
		return count;
	}

	@Override
	public long count(newsQueryParams map) throws Exception {
		// TODO Auto-generated method stub
		return super.count(map);
	}

	@Override
	public news getById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return super.getById(id);
	}

	@Override
	public List<news> getBasic(newsQueryParams map) throws Exception {
		// TODO Auto-generated method stub
		return super.getBasic(map);
	}

	@Override
	public List<news> getDetail(newsQueryParams map) throws Exception {
		// TODO Auto-generated method stub
		return super.getDetail(map);
	}

	@Override
	public newsMapper getDao() {
		// TODO Auto-generated method stub
		return super.getDao();
	}

	@Override
	public void setDao(newsMapper dao) {
		// TODO Auto-generated method stub
		super.setDao(dao);
	}

}
