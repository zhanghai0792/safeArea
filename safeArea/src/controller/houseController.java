package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.query.houseQueryParams;
import json.jsonResult;
import pojo.house;
import servicesDao.houseServiceDao;
import util.StringUtil;

@Controller
@RequestMapping("/HouseServlet")
public class houseController extends controllerTemplate<house, houseServiceDao, houseQueryParams>{

	@Override
	protected jsonResult query(houseQueryParams im) throws Exception {
         if(im.getHouseID()!=null){
        	 house house=serviceDao.getById(im.getHouseID());
        	 jsonResult json=null;
        	 if(house!=null){
        		 json=new jsonResult(house, "查找成功");
        	 }else{
        		 json=new jsonResult(false, "没有查询到指定id的房屋信息");
        	 }
        	 return json;
         }else{
        	 return getPagesDetail(im);
         }

	}
	
	public void addPY(house houser){
		if(houser!=null&&StringUtil.isNotEmpty(houser.getOwner())){
			houser.setPinYin(StringUtil.getPY(houser.getOwner()));
		}
	}

}
