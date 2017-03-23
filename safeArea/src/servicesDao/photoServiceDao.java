package servicesDao;

import java.util.Map;

import org.springframework.stereotype.Service;

import dao.photoMapper;
import dao.query.photoQueryParams;
import pojo.photo;
@Service
public class photoServiceDao extends serviceDaoTemplate<photo, photoMapper,photoQueryParams>{
	public int deletes(photoQueryParams query)throws Exception{
		return dao.deletePhotos(query);
	}
}
