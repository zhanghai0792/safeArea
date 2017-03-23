package dao.query;
import pojo.user;
public class userQueryParams extends queryParamsModel<user>{

	@Override
	public user getObj() {
		// TODO Auto-generated method stub
		return user;
	}
    private String phone;//用来判断该电话号码是否注册了
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
    
}
