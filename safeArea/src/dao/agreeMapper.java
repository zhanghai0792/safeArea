package dao;

import dao.query.agreeQueryParams;
import pojo.agree;

public interface agreeMapper extends daoTemplate<agree, agreeQueryParams>{
   int deleteAgreesByInteractionId(Integer interactionID);
}