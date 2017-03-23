package dao;


import dao.query.userQueryParams;
import pojo.user;

public interface userMapper extends daoTemplate<user,userQueryParams>{
  user login(userQueryParams query);

}