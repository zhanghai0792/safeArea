package dao;

import java.util.List;
import java.util.Map;

import dao.query.queryParamsModel;
import pojo.pojoModel;

public interface daoTemplate <T,Query extends queryParamsModel>{
	int deleteByPrimaryKey(Integer id);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(T record);

     int updateByPrimaryKey(T record);
   
    //cond查询条件
   //pageIndex 分页
   //pageSize 每夜长度
    List<T> getBasic(Query map);
    List<T> getDetail(Query map);
    long count(Query map);
    
}
