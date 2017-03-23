package pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class interaction implements pojoModel{
public final static int photoType=4;
private Integer id;//主键
private String title;//标题
private String content;//内容
private List<photo> photos=new ArrayList<photo>(0);//图片集合
private Date releaseTime;//发布时间
private int agreeNum;//点赞数
private Boolean isDelete;//是否已经删除
private List<reply> replies=new ArrayList<reply>(0);
private Integer releaseID;
private String releaseName;
private List<agree> agrees=new ArrayList<agree>(0);
public Integer getReleaseID() {
	return releaseID;
}
public void setReleaseID(Integer releaseID) {
	this.releaseID = releaseID;
}
public String getReleaseName() {
	return releaseName;
}
public void setReleaseName(String releaseName) {
	this.releaseName = releaseName;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}

public List<photo> getPhotos() {
	return photos;
}
public void setPhotos(List<photo> photos) {
	this.photos = photos;
}
public Date getReleaseTime() {
	return releaseTime;
}
public void setReleaseTime(Date releaseTime) {
	this.releaseTime = releaseTime;
}
public int getAgreeNum() {
	return agreeNum;
}
public void setAgreeNum(int agreeNum) {
	this.agreeNum = agreeNum;
}
public Boolean getIsDelete() {
	return isDelete;
}
public void setIsDelete(Boolean isDelete) {
	this.isDelete = isDelete;
}
public List<reply> getReplies() {
	return replies;
}
public void setReplies(List<reply> replies) {
	this.replies = replies;
}
public List<agree> getAgrees() {
	return agrees;
}
public void setAgrees(List<agree> agrees) {
	this.agrees = agrees;
}


}
