package servicesDao;

import org.springframework.beans.factory.annotation.Autowired;

import dao.agreeMapper;
import dao.interactionMapper;
import dao.query.agreeQueryParams;
import dao.query.interactionQueryParams;
import pojo.agree;

public class agreeServiceDao extends serviceDaoTemplate<agree, agreeMapper, agreeQueryParams>{
    @Autowired
	 interactionMapper interactionMapper;
	  
	@Override
	public int save(agree record) throws Exception {
		//把关注的点赞数+1
		interactionQueryParams query=new interactionQueryParams();
		query.setChangeAgreeNumInteractionId(record.getInteractionID());
		query.setChangeAreeNum(1);
		interactionMapper.updateAgreeNum(query);
		return super.save(record);
	}

	@Override
	public int delete(agree record) throws Exception {
		interactionQueryParams query=new interactionQueryParams();
		query.setChangeAgreeNumInteractionId(record.getInteractionID());
		query.setChangeAreeNum(-1);
		interactionMapper.updateAgreeNum(query);
		return super.delete(record);
	}
     
}
