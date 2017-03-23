package dao.query;

import java.util.List;

import pojo.area;
import pojo.car;
import util.StringUtil;

public class carQueryParams extends queryParamsModel<car>{

	private car car;
	private Integer areaID;
	private String condition;
	
	public car getObj() {
		// TODO Auto-generated method stub
		return car;
	}
	public car getCar() {
		return car;
	}
	public void setCar(car car) {
		this.car = car;
	}
	public Integer getAreaID() {
		return areaID;
	}
	public void setAreaID(Integer areaID) {
		this.areaID = super.setNullId(areaID);
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		if(StringUtil.isNotEmpty(condition))
			this.condition = condition.toUpperCase();
	}
	

}
