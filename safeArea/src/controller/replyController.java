package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.query.replyQueryParams;
import json.jsonResult;
import pojo.reply;
import servicesDao.replyServiceDao;

@Controller
@RequestMapping("/ReplyServlet")
public class replyController extends controllerTemplate<reply, replyServiceDao, replyQueryParams>{

	@Override
	protected jsonResult query(replyQueryParams im) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
