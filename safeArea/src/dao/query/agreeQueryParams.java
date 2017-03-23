package dao.query;

import pojo.agree;

public class agreeQueryParams extends queryParamsModel<agree> {
   private agree agree;
	@Override
	public agree getObj() {
		// TODO Auto-generated method stub
		return agree;
	}
	public agree getAgree() {
		return agree;
	}
	public void setAgree(agree agree) {
		this.agree = agree;
	}

}
