package dao.query;

import java.util.List;

import pojo.pojoModel;
import pojo.user;
public abstract class queryParamsModel<T extends pojoModel>{
protected user user;
protected Integer page;
protected Integer pageSize;
private Integer recordIndex;
private String orderBy;
private List<T> pojos;
public abstract T getObj();
public user getUser() {
	return user;
}
public void setUser(user user) {
	this.user = user;
}
public Integer getPage() {
	return page;
}
public void setPage(Integer page) {
	if(page!=null&&page>0){
	this.page = page;
	}
}
public Integer getPageSize() {
	return pageSize;
}
public void setPageSize(Integer pageSize) {
	this.pageSize = pageSize;
}
protected Integer setNullId(Integer id){
	if(id!=null&&id>0)
		return id;
	return null;
}
public Integer getRecordIndex() {
	if(setNullId(page)!=null){
		if(setNullId(pageSize)==null)
			pageSize=3;
		recordIndex=(page-1)*pageSize;
	}
	return null;
}
public List<T> getPojos() {
	return pojos;
}
public void setPojos(List<T> pojos) {
	this.pojos = pojos;
}
public String getOrderBy() {
	return orderBy;
}
public void setOrderBy(String orderBy) {
	this.orderBy = orderBy;
}



}
