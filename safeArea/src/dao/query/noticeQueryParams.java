package dao.query;

import pojo.notice;

public class noticeQueryParams extends queryParamsModel<notice>{
     private notice notice;
	@Override
	public notice getObj() {
		// TODO Auto-generated method stub
		return notice;
	}
	public notice getNotice() {
		return notice;
	}
	public void setNotice(notice notice) {
		this.notice = notice;
	}

}
