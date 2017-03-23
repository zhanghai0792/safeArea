package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.query.carQueryParams;
import json.jsonResult;
import pojo.car;
import servicesDao.carServiceDao;
import util.StringUtil;
@Controller
@RequestMapping("/CarServlet")
public class carController extends controllerTemplate<car, carServiceDao, carQueryParams>{

	@Override
	protected jsonResult query(carQueryParams im) throws Exception {
		 return getPagesDetail(im);
	}
   /*覆盖模板中的方法，这样此pojo类就具有姓名添加拼音的功能*/
	public void addPY(car car){
		if(car!=null&&StringUtil.isNotEmpty(car.getOwner())){
			car.setPinYin(StringUtil.getPY(car.getOwner()));
		}
	}
	
}
