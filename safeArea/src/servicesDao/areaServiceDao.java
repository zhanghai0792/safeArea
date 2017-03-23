package servicesDao;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.areaMapper;
import dao.photoMapper;
import dao.query.areaQueryParams;
import dao.query.photoQueryParams;
import pojo.area;
import pojo.photo;
import pojo.pojoModel;
import util.ListUtil;

@Service
public class areaServiceDao extends serviceDaoTemplate<area, areaMapper,areaQueryParams> {
   //注意之后要删除物理图片的物理文件
	private int deletesAreaAndPhotosById(areaQueryParams queryParam) throws Exception {
		photoQueryParams photoQuery=new photoQueryParams();
		photoQuery.setFks(queryParam.getPojos());
		photoQuery.setType(area.photoType);
		photoMapper.deletePhotos(photoQuery);
		return dao.deletesById(queryParam);
	}

	public int deletes(areaQueryParams queryParam) throws Exception {
		photoQueryParams photoQuery=new photoQueryParams();
		photoQuery.setFks(queryParam.getPojos());
		photoQuery.setType(area.photoType);
		photoMapper.deletePhotos(photoQuery);
		return dao.deletesById(queryParam);
	}
	
public	List<String> getImgPaths(List<area> areas) throws Exception {
		return dao.getImgPaths(areas);
	}

	
	public int savePhtosInWeb(area record) throws Exception {
		int count = super.save(record);
		//先保存pojo基本信息
		//有图片用当前pojo的id存储图片，再更新pojo
		//super.savePhoto(record.getPhotos(), record, record.photoType);
		return count;
	}
	public int save(area record) throws Exception {
		int count = super.save(record);
        super.savePhoto(record.getPhotos(), record, record.photoType);
		return count;
	}
	
	@Override
	public int updateNoNull(area record) throws Exception {
		int count = super.updateNoNull(record);
		super.savePhoto(record.getPhotos(), record, record.photoType);
		return count;
	}

	@Override
	public int delete(area record) throws Exception {
		photoQueryParams photoQuery=new photoQueryParams();
		photoQuery.setFk(record.getId());
		photoQuery.setType(area.photoType);
		photoMapper.deletePhotos(photoQuery);
		return super.delete(record);//进到父类该方法上传area对象
	}

	@Override
	public int updateAll(area record) throws Exception {
		int count = super.updateAll(record);
		super.savePhoto(record.getPhotos(), record, record.photoType);
		return count;
	}

	@Override
	public areaMapper getDao() {
		// TODO Auto-generated method stub
		return super.getDao();
	}

	@Override
	public void setDao(areaMapper dao) {
		// TODO Auto-generated method stub
		super.setDao(dao);
	}

}
