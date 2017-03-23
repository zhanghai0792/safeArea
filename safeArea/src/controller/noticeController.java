package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.query.noticeQueryParams;
import json.jsonResult;
import pojo.notice;
import servicesDao.noticeServicDao;
@Controller
@RequestMapping("/NoticeServlet")
public class noticeController extends controllerTemplate<notice, noticeServicDao, noticeQueryParams>{

	@Override
	protected jsonResult query(noticeQueryParams im) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
