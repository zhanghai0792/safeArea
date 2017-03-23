package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import dao.query.interactionQueryParams;
import json.jsonResult;
import pojo.interaction;
import pojo.photo;
import servicesDao.interactionServiceDao;
import util.ListUtil;

@Controller
@RequestMapping("/InteractionServlet")
public class interactionController
		extends controllerTemplate<interaction, interactionServiceDao, interactionQueryParams> {

	@Override
	protected jsonResult query(interactionQueryParams im) throws Exception {
		if(im.getInteractionID()==null){
			//只显示发帖，不显示跟贴
			return serviceDao.getPagesResultDetail(im);
		}else{
			//显示发帖及跟贴
			interaction in=serviceDao.getById(im.getInteractionID());
			if(in!=null){
				return new jsonResult(in, "提取成功");
			}else{
				return new jsonResult(false, "没有对应id的发帖");
			}
		}
	}
	
	
	// 覆盖controller模板的方法
	public boolean androidUploadPhotosSaveOrUpdate(interactionQueryParams data, MultipartFile[] file) throws Exception {
		interaction interaction = data.getObj();
		if (interaction.getId() == null) {
			//如果该对象没有保存过
			serviceDao.save(interaction);
		}
		if (ListUtil.isNotEmpty(file)) {
			//将上传的图片存储到硬盘中
			List<photo> photos = super.saveDiskPhotosFiles(interaction.photoType, interaction.getId(),
					interaction.getId() + "", file);
			//图片关联上对象，后续去更新
			interaction.setPhotos(photos);
		}
		return true;
	}

}
