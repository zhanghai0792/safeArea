package servicesDao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import dao.houseMapper;
import dao.query.houseQueryParams;
import pojo.house;
@Service
public class houseServiceDao extends serviceDaoTemplate<house, houseMapper,houseQueryParams>{

	@Override
	public int save(house record) throws Exception {
		// TODO Auto-generated method stub
		return super.save(record);
	}

	@Override
	public int updateNoNull(house record) throws Exception {
		// TODO Auto-generated method stub
		return super.updateNoNull(record);
	}

	@Override
	public int delete(house record) throws Exception {
		// TODO Auto-generated method stub
		return super.delete(record);
	}

	@Override
	public int updateAll(house record) throws Exception {
		// TODO Auto-generated method stub
		return super.updateAll(record);
	}

	@Override
	public long count(houseQueryParams map) throws Exception {
		// TODO Auto-generated method stub
		return super.count(map);
	}

	@Override
	public house getById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return super.getById(id);
	}

	@Override
	public List<house> getBasic(houseQueryParams map) throws Exception {
		// TODO Auto-generated method stub
		return super.getBasic(map);
	}

	@Override
	public List<house> getDetail(houseQueryParams map) throws Exception {
		// TODO Auto-generated method stub
		return super.getDetail(map);
	}

	@Override
	public houseMapper getDao() {
		// TODO Auto-generated method stub
		return super.getDao();
	}

	@Override
	public void setDao(houseMapper dao) {
		// TODO Auto-generated method stub
		super.setDao(dao);
	}

}
