package pojo;

import java.util.Date;

public class shop implements pojoModel{
private Integer id;//主键
private String name;//名称
private String address;//地址
private String businessScope;//经营范围
private String owner;//业主姓名
private String pinYin;//业主姓名拼音
private String cardID;//身份证号
private String phone;//联系电话
private Integer areaID;//小区ID
private Integer adderID;//采集人ID
private Date createDate;//采集时间

public String areaName;//小区名
public String adderName;//采集人姓名


public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getAreaName() {
	return areaName;
}
public void setAreaName(String areaName) {
	this.areaName = areaName;
}
public String getAdderName() {
	return adderName;
}
public void setAdderName(String adderName) {
	this.adderName = adderName;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getBusinessScope() {
	return businessScope;
}
public void setBusinessScope(String businessScope) {
	this.businessScope = businessScope;
}
public String getOwner() {
	return owner;
}
public void setOwner(String owner) {
	this.owner = owner;
}
public String getPinYin() {
	return pinYin;
}
public void setPinYin(String pinYin) {
	this.pinYin = pinYin;
}
public String getCardID() {
	return cardID;
}
public void setCardID(String cardID) {
	this.cardID = cardID;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public Integer getAreaID() {
	return areaID;
}
public void setAreaID(Integer areaID) {
	this.areaID = areaID;
}
public Integer getAdderID() {
	return adderID;
}
public void setAdderID(Integer adderID) {
	this.adderID = adderID;
}
public Date getCreateDate() {
	return createDate;
}
public void setCreateDate(Date createDate) {
	this.createDate = createDate;
}


}
