package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.query.shopQueryParams;
import json.jsonResult;
import pojo.car;
import pojo.shop;
import servicesDao.shopServiceDao;
import util.StringUtil;
@Controller
@RequestMapping("/ShopServlet")
public class shopController extends controllerTemplate<shop, shopServiceDao, shopQueryParams>{

	@Override
	protected jsonResult query(shopQueryParams im) throws Exception {
		return super.getPagesDetail(im);
	}
	 /*覆盖模板中的方法，这样此pojo类就具有姓名添加拼音的功能*/
		public void addPY(shop shop){
			if(shop !=null &&StringUtil.isNotEmpty(shop.getOwner())){
				shop.setPinYin(StringUtil.getPY(shop.getOwner()));
			}
		}
}
