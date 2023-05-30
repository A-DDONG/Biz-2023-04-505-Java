package com.callor.shop.models;

public class BuyerDto {

	public String buId; // VARCHAR2(10)
	public String buName; // nVARCHAR2(20)
	public String buTel; // VARCHAR2(10)
	public String buAddr; // VARCHAR2(125)

	public BuyerDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BuyerDto(String buId, String buName, String buTel, String buAddr) {
		super();
		this.buId = buId;
		this.buName = buName;
		this.buTel = buTel;
		this.buAddr = buAddr;
	}

	@Override
	public String toString() {
		return "BuyerDto [buId=" + buId + ", buName=" + buName + ", buTel=" + buTel + ", buAddr=" + buAddr + "]";
	}

}