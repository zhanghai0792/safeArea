package dao;

import dao.query.interactionQueryParams;
import pojo.area;
import pojo.interaction;

public interface interactionMapper extends daoTemplate<interaction,interactionQueryParams>{
 /* int updateByPrimaryKeyWithBLOBs(interaction record);*/

	int updateAgreeNum(interactionQueryParams query);
 
}