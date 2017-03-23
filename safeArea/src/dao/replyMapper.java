package dao;



import dao.query.replyQueryParams;
import pojo.reply;

public interface replyMapper extends daoTemplate<reply,replyQueryParams>{
	public int deleteByInteractionId(Integer id);
}