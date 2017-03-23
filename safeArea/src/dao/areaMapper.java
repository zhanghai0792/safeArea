package dao;

import java.util.List;
import java.util.Map;

import dao.query.areaQueryParams;
import pojo.area;

public interface areaMapper extends daoTemplate<area,areaQueryParams>{
 int deletesById(areaQueryParams map);
 List<String> getImgPaths(List<area> areas);
}