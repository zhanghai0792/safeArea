package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.query.agreeQueryParams;
import json.jsonResult;
import pojo.agree;
import servicesDao.agreeServiceDao;

@Controller
@RequestMapping("/AgreeServlet")
public class agreeController extends controllerTemplate<agree, agreeServiceDao, agreeQueryParams>{

	@Override
	protected jsonResult query(agreeQueryParams im) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
/*//要覆盖父类的添加，删除的功能
	jsonResult androidInsertTemplate(agreeQueryParams im) throws Exception{
		
	}
	
	private jsonResult androidDeleteTemplate(agreeQueryParams im) throws Exception{
		
	}*/
}
