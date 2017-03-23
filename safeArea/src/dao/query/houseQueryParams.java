package dao.query;

import java.util.List;

import pojo.car;
import pojo.house;
import util.StringUtil;

public class houseQueryParams extends queryParamsModel<house>{
    
	private house house;
	private String condition;
	private Integer houseType;
	private Integer houseID;
	public house getObj() {
		// TODO Auto-generated method stub
		return house;
	}
	public house getHouse() {
		return house;
	}
	public void setHouse(house house) {
		this.house = house;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public Integer getHouseType() {
		return houseType;
	}
	public void setHouseType(Integer houseType) {
		this.houseType = houseType;
	}
	public Integer getHouseID() {
		return houseID;
	}
	public void setHouseID(Integer houseID) {
		this.houseID = houseID;
	}

}
