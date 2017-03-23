package dao.query;

import java.util.List;

import pojo.photo;
import pojo.pojoModel;

public class photoQueryParams extends queryParamsModel<photo>{
    private photo photo;
    private List<pojoModel> fks;//图片关联的用外键的方式
    private Integer type;
    private Integer fk;
    //pojos 图片自身
	@Override
	public photo getObj() {
		// TODO Auto-generated method stub
		return photo;
	}
	public photo getPhoto() {
		return photo;
	}
	public void setPhoto(photo photo) {
		this.photo = photo;
	}
	public List<pojoModel> getFks() {
		return fks;
	}
	public void setFks(List fks) {
		this.fks = fks;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getFk() {
		return fk;
	}
	public void setFk(Integer fk) {
		this.fk = fk;
	}

	
	

}
