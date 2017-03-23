package servicesDao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import dao.carMapper;
import dao.query.carQueryParams;
import pojo.car;
import pojo.photo;
@Service
public class carServiceDao extends serviceDaoTemplate<car, carMapper,carQueryParams>{

	@Override
	public int save(car record) throws Exception {
		// TODO Auto-generated method stub
		return super.save(record);
	}

	@Override
	public int updateNoNull(car record) throws Exception {
		// TODO Auto-generated method stub
		return super.updateNoNull(record);
	}

	

	@Override
	public int delete(car record) throws Exception {
		// TODO Auto-generated method stub
		return super.delete(record);
	}

	@Override
	public int updateAll(car record) throws Exception {
		// TODO Auto-generated method stub
		return super.updateAll(record);
	}

	@Override
	public long count(carQueryParams map) throws Exception {
		// TODO Auto-generated method stub
		return super.count(map);
	}

	@Override
	public car getById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return super.getById(id);
	}

	@Override
	public List<car> getBasic(carQueryParams map) throws Exception {
		// TODO Auto-generated method stub
		return super.getBasic(map);
	}

	@Override
	public List<car> getDetail(carQueryParams map) throws Exception {
		// TODO Auto-generated method stub
		return super.getDetail(map);
	}

	@Override
	public carMapper getDao() {
		// TODO Auto-generated method stub
		return super.getDao();
	}

	@Override
	public void setDao(carMapper dao) {
		// TODO Auto-generated method stub
		super.setDao(dao);
	}


}
