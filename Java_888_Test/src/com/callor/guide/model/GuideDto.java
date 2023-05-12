package com.callor.guide.model;

public class GuideDto {
// id,종목명,순번,가이드
	
	private String guideId;
	private String guideName;
	private String guideOrder;
	private String guideInformation;
	
	public GuideDto() {
		super();
	}
	public GuideDto(String guideId, String guideName, String guideOrder, String guideInformation) {
		super();
		this.guideId = guideId;
		this.guideName = guideName;
		this.guideOrder = guideOrder;
		this.guideInformation = guideInformation;
	}
	public String getGuideId() {
		return guideId;
	}
	public void setGuideId(String guideId) {
		this.guideId = guideId;
	}
	public String getGuideName() {
		return guideName;
	}
	public void setGuideName(String guideName) {
		this.guideName = guideName;
	}
	public String getGuideOrder() {
		return guideOrder;
	}
	public void setGuideOrder(String guideOrder) {
		this.guideOrder = guideOrder;
	}
	public String getGuideInformation() {
		return guideInformation;
	}
	public void setGuideInformation(String guideInformation) {
		this.guideInformation = guideInformation;
	}
	@Override
	public String toString() {
		return "GuideDto [guideId=" + guideId + ", guideName=" + guideName + ", guideOrder=" + guideOrder
				+ ", guideInformation=" + guideInformation + "]";
	}
	
	
	
}
