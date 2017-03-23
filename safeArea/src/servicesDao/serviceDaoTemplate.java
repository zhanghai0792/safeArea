package servicesDao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.daoTemplate;
import dao.photoMapper;
import dao.query.queryParamsModel;
import json.jsonResult;
import pojo.area;
import pojo.photo;
import pojo.pojoModel;
import util.ListUtil;
@Service
public abstract class serviceDaoTemplate<T extends pojoModel,Dao extends daoTemplate<T,Query>,Query extends queryParamsModel<T>>{
    @Autowired
	protected Dao dao;
    @Autowired
    protected photoMapper photoMapper;
    public   int save(T record) throws Exception{
    	return dao.insert(record);
    }
   
    public int updateNoNull(T record) throws Exception{
    	return dao.updateByPrimaryKeySelective(record);
    }
    public final int savePhoto(photo p,T record,int type)throws Exception{
    	if(p.getId()==null){
			 p.setObjId(record.getId());
			 p.setType(type);
			 return photoMapper.insert(p);
    	}
    	return 0;
    }
    
    public final int savePhoto(List photos,T record,int type)throws Exception{
    	 int sum=0;
    	if(ListUtil.isNotEmpty(photos)){
			 for(Object p:photos){ 
				sum=sum+ savePhoto((photo)p,record,type);}
			 }
    	return sum;
    }
    
    public int delete(T record)throws Exception{
    	return dao.deleteByPrimaryKey(record.getId());
    }
    //更新所有的属性，null
    public int updateAll(T record)throws Exception{
    	return dao.updateByPrimaryKey(record);
    }
    public long count(Query query) throws Exception{
    	return dao.count(query);
    }
    public T getById(Integer id)throws Exception{
    	return dao.selectByPrimaryKey(id);
    }
    public List<T> getBasic(Query query)throws Exception{
    	return dao.getBasic(query);
    }
    
    
    public List<T> getDetail(Query query)throws Exception{
    	List pojos=getBasic(query);
    	query=(Query) query.getClass().newInstance();
    	query.setPojos(pojos);//解决1->N 分页问题
    	return dao.getDetail(query);
    }
    public List<T> getDetailNoByBasic (Query query)throws Exception{
    	return dao.getDetail(query);
    }
    
   /*基本的分页查询*/
    public jsonResult getPagesResultBasic(Query query)throws Exception{
    	long total=count(query);
    	List datas=getBasic(query);
    	return new jsonResult(true, "查询基本信息成功", total, query.getPageSize(), datas);
    }
    /*详情是在basic查询的基础上再次查询主要用于1->N的分页查询*/
    public jsonResult getPagesResultDetail(Query query)throws Exception{
    	long total=count(query);
    	List datas=getDetail(query);
    	return new jsonResult(true, "查询详细信息成功", total, query.getPageSize(), datas);
    }
    
    /*详细的分页查询,直接查询，不通过basic查询方式*/
    public jsonResult getPagesResultDetailNoBasic(Query query)throws Exception{
    	long total=count(query);
    	List datas=getDetailNoByBasic(query);
    	return new jsonResult(true, "查询详细信息成功", total, query.getPageSize(), datas);
    }
    
    
	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}
    
    
    
}
