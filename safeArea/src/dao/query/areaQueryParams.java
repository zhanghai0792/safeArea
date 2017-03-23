package dao.query;

import java.util.List;

import pojo.area;

public class areaQueryParams extends queryParamsModel<area>{
 private String placeStation;
 private area area;
public String getPlaceStation() {
	return placeStation;
}

public void setPlaceStation(String placeStation) {
	this.placeStation = placeStation;
}

@Override
public area getObj() {
	return area;
}

public area getArea() {
	return area;
}

public void setArea(area area) {
	this.area = area;
}


 


}
