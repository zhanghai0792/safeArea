package dao.query;

import pojo.shop;
import util.StringUtil;

public class shopQueryParams extends queryParamsModel<shop>{
   private shop shop;
   private Integer areaID;
   private String condition;
	@Override
	public shop getObj() {
		// TODO Auto-generated method stub
		return shop;
	}
	public shop getShop() {
		return shop;
	}
	public void setShop(shop shop) {
		this.shop = shop;
	}
	public Integer getAreaID() {
		return areaID;
	}
	public void setAreaID(Integer areaID) {
		this.areaID = areaID;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		if(StringUtil.isNotEmpty(condition))
		this.condition = condition.toUpperCase();
	}

}
