package com.callor.bank.model;

/* 
 * 계좌정보 데이터 클래스
 * 
 * 계좌번호	문자열(10)	acNum
 * 계좌구분 문자열 acDiv
 * 고객구분 문자열 buId
 * 최종잔액 정수형 acBalance
*/

public class AccDto {
	
	public String acNum;
	public String acDiv;
	public String buId;
	public int acTime;
	
	public AccDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccDto(String acNum, String acDiv, String buId, int acTime) {
		super();
		this.acNum = acNum;
		this.acDiv = acDiv;
		this.buId = buId;
		this.acTime = acTime;
	}

	@Override
	public String toString() {
		return "AccDto [acNum=" + acNum + ", acDiv=" + acDiv + ", buId=" + buId + ", acTime=" + acTime + "]";
	}
	
}
