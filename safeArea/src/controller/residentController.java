package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.query.residentQueryParams;
import json.jsonResult;
import pojo.house;
import pojo.resident;
import servicesDao.residentServiceDao;
import util.StringUtil;

@Controller
public class residentController extends controllerTemplate<resident,residentServiceDao,residentQueryParams>{

	@Override
	protected jsonResult query(residentQueryParams im) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	public void addPY(resident resident){
		if(resident!=null&&StringUtil.isNotEmpty(resident.getName())){
			resident.setPinYin(StringUtil.getPY(resident.getName()));
		}
	}
}
