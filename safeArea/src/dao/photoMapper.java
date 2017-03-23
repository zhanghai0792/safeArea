package dao;
import dao.query.photoQueryParams;
import pojo.area;
import pojo.photo;

public interface photoMapper extends daoTemplate<photo,photoQueryParams>{
	//fk type ids
 public int deletePhotos(photoQueryParams map);

}