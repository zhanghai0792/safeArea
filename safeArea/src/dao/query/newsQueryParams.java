package dao.query;

import pojo.news;

public class newsQueryParams extends queryParamsModel<news>{
    private news news;
    private Integer newsId;
	@Override
	public news getObj() {
		// TODO Auto-generated method stub
		return news;
	}
	public news getNews() {
		return news;
	}
	public void setNews(news news) {
		this.news = news;
	}
	public Integer getNewsId() {
		return newsId;
	}
	public void setNewsId(Integer newsId) {
		this.newsId = newsId;
	}

}
