package servicesDao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import dao.residentMapper;
import dao.query.photoQueryParams;
import dao.query.residentQueryParams;
import pojo.area;
import pojo.resident;
@Service
public class residentServiceDao extends serviceDaoTemplate<resident, residentMapper, residentQueryParams> {

	@Override
	public int save(resident record) throws Exception {
		int count = super.save(record);
		if (record.getHeader() != null)
			super.savePhoto(record.getHeader(), record, record.photoType);
		return count;
	}

	@Override
	public int updateNoNull(resident record) throws Exception {
		// TODO Auto-generated method stub
		int count = super.updateNoNull(record);
		if (record.getHeader() != null)
			super.savePhoto(record.getHeader(), record, record.photoType);
		return count;
	}

	@Override
	public int delete(resident record) throws Exception {
		int count = super.delete(record);
		if (record.getHeader() != null) {
			photoQueryParams photoQuery = new photoQueryParams();
			photoQuery.setFk(record.getId());
			photoQuery.setType(area.photoType);
			photoMapper.deletePhotos(photoQuery);
		}
		return count;
	}

	@Override
	public int updateAll(resident record) throws Exception {

		int count = super.updateAll(record);
		if (record.getHeader() != null)
			super.savePhoto(record.getHeader(), record, record.photoType);
		return count;
	}

	@Override
	public long count(residentQueryParams map) throws Exception {
		// TODO Auto-generated method stub
		return super.count(map);
	}

	@Override
	public resident getById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return super.getById(id);
	}

	@Override
	public List<resident> getBasic(residentQueryParams map) throws Exception {
		// TODO Auto-generated method stub
		return super.getBasic(map);
	}

	@Override
	public List<resident> getDetail(residentQueryParams map) throws Exception {
		// TODO Auto-generated method stub
		return super.getDetail(map);
	}

	@Override
	public residentMapper getDao() {
		// TODO Auto-generated method stub
		return super.getDao();
	}

	@Override
	public void setDao(residentMapper dao) {
		// TODO Auto-generated method stub
		super.setDao(dao);
	}

}
