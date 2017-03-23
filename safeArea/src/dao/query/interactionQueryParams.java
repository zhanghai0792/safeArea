package dao.query;

import pojo.interaction;

public class interactionQueryParams extends queryParamsModel<interaction>{

	private interaction interaction;
	private Integer interactionID;
	private Integer changeAgreeNumInteractionId;//被点赞的互动
	private int changeAreeNum;//+1或者-1
	public interaction getObj() {
		// TODO Auto-generated method stub
		return interaction;
	}
	public interaction getInteraction() {
		return interaction;
	}
	public void setInteraction(interaction interaction) {
		this.interaction = interaction;
	}
	public Integer getInteractionID() {
		return interactionID;
	}
	public void setInteractionID(Integer interactionID) {
		this.interactionID = interactionID;
	}
	public Integer getChangeAgreeNumInteractionId() {
		return changeAgreeNumInteractionId;
	}
	public void setChangeAgreeNumInteractionId(Integer changeAgreeNumInteractionId) {
		this.changeAgreeNumInteractionId = changeAgreeNumInteractionId;
	}
	public int getChangeAreeNum() {
		return changeAreeNum;
	}
	public void setChangeAreeNum(int changeAreeNum) {
		this.changeAreeNum = changeAreeNum;
	}

}
