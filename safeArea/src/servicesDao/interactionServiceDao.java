package servicesDao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.agreeMapper;
import dao.interactionMapper;
import dao.replyMapper;
import dao.query.interactionQueryParams;
import dao.query.photoQueryParams;
import pojo.area;
import pojo.interaction;
@Service
public class interactionServiceDao extends serviceDaoTemplate<interaction, interactionMapper,interactionQueryParams>{
    @Autowired
	replyMapper replyMapper;
	@Autowired
    agreeMapper agreeMapper;
	@Override
	public int save(interaction record) throws Exception {
		int count= super.save(record);
	   super.savePhoto(record.getPhotos(), record,record.photoType);
		return count;
	}

	@Override
	public int updateNoNull(interaction record) throws Exception {
		int count=super.updateNoNull(record);
		 super.savePhoto(record.getPhotos(), record,record.photoType);
		return count;
	}

	@Override
	public int delete(interaction record) throws Exception {
		photoQueryParams photoQuery=new photoQueryParams();
		photoQuery.setFk(record.getId());
		photoQuery.setType(area.photoType);
		//清除图片信息
		photoMapper.deletePhotos(photoQuery);
		//清除回复信息
		replyMapper.deleteByInteractionId(record.getId());
		//清除点赞的记录
		agreeMapper.deleteAgreesByInteractionId(record.getId());
		return super.delete(record);
	}

	@Override
	public int updateAll(interaction record) throws Exception {
		 super.savePhoto(record.getPhotos(), record,record.photoType);
		return super.updateAll(record);
	}

	
	@Override
	public long count(interactionQueryParams map) throws Exception {
		// TODO Auto-generated method stub
		return super.count(map);
	}

	@Override
	public interaction getById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return super.getById(id);
	}

	@Override
	public List<interaction> getBasic(interactionQueryParams map) throws Exception {
		// TODO Auto-generated method stub
		return super.getBasic(map);
	}

	@Override
	public List<interaction> getDetail(interactionQueryParams map) throws Exception {
		// TODO Auto-generated method stub
		return super.getDetail(map);
	}

	@Override
	public interactionMapper getDao() {
		// TODO Auto-generated method stub
		return super.getDao();
	}

	@Override
	public void setDao(interactionMapper dao) {
		// TODO Auto-generated method stub
		super.setDao(dao);
	}

	public replyMapper getReplyMapper() {
		return replyMapper;
	}

	public void setReplyMapper(replyMapper replyMapper) {
		this.replyMapper = replyMapper;
	}

	public agreeMapper getAgreeMapper() {
		return agreeMapper;
	}

	public void setAgreeMapper(agreeMapper agreeMapper) {
		this.agreeMapper = agreeMapper;
	}

	
}
