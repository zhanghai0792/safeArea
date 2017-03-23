package servicesDao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import dao.userMapper;
import dao.query.photoQueryParams;
import dao.query.userQueryParams;
import pojo.area;
import pojo.user;
@Service
public class userServiceDao extends serviceDaoTemplate<user, userMapper, userQueryParams> {

	@Override
	public int save(user record) throws Exception {
		int count = super.save(record);
		if (record.getHeader() != null)
			super.savePhoto(record.getHeader(), record, record.photoType);
		return count;
	}
    
	public user login(userQueryParams query)throws Exception{
		return dao.login(query);
	}
	
	@Override
	public int updateNoNull(user record) throws Exception {
		// TODO Auto-generated method stub
		int count = super.updateNoNull(record);
		if (record.getHeader() != null)
			super.savePhoto(record.getHeader(), record, record.photoType);
		return count;
	}

	@Override
	public int delete(user record) throws Exception {
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
	public int updateAll(user record) throws Exception {

		int count = super.updateAll(record);
		if (record.getHeader() != null)
			super.savePhoto(record.getHeader(), record, record.photoType);
		return count;
	}

	@Override
	public long count(userQueryParams map) throws Exception {
		// TODO Auto-generated method stub
		return super.count(map);
	}

	@Override
	public user getById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return super.getById(id);
	}

	@Override
	public List<user> getBasic(userQueryParams map) throws Exception {
		// TODO Auto-generated method stub
		return super.getBasic(map);
	}

	@Override
	public List<user> getDetail(userQueryParams map) throws Exception {
		// TODO Auto-generated method stub
		return super.getDetail(map);
	}

	@Override
	public userMapper getDao() {
		// TODO Auto-generated method stub
		return super.getDao();
	}

	@Override
	public void setDao(userMapper dao) {
		// TODO Auto-generated method stub
		super.setDao(dao);
	}

}
