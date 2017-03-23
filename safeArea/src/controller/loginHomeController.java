package controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import dao.query.userQueryParams;
import json.MyObjectMapper;
import json.jsonResult;
import pojo.user;
import servicesDao.userServiceDao;
import util.StringUtil;

@Controller
public class loginHomeController {
	@Autowired
	userServiceDao serviceDao;
	@Autowired
	protected MyObjectMapper myObjectMapper;

	@RequestMapping("/LoginServlet")
	@ResponseBody
	public jsonResult login(@RequestParam("params") String userJson,@RequestParam("method") Integer method) throws Exception {
		jsonResult json = null;
		if (StringUtil.isNotEmpty(userJson)) {
			//System.out.println(userJson);
			user user = myObjectMapper.readValue(userJson, user.class);
			userQueryParams query = new userQueryParams();
			query.setUser(user);
			user = serviceDao.login(query);
			if (user != null) {
				json = new jsonResult(user, "登录成功");
			} else {
				json = new jsonResult(false, "用户名或密码不正确");
			}
		} else {
			json = new jsonResult(false, "参数输入不正确");
		}
		return json;
	}

	@RequestMapping("/HomepageServlet")
	@ResponseBody
	public jsonResult home()throws Exception{
		
		
		return null;
	}
	
	
	public userServiceDao getServiceDao() {
		return serviceDao;
	}

	public void setServiceDao(userServiceDao serviceDao) {
		this.serviceDao = serviceDao;
	}

	public MyObjectMapper getMyObjectMapper() {
		return myObjectMapper;
	}

	public void setMyObjectMapper(MyObjectMapper myObjectMapper) {
		this.myObjectMapper = myObjectMapper;
	}

}
