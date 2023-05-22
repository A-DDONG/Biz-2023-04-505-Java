package com.callor.bank.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.bank.model.AccDto;
import com.callor.bank.service.AccService;
import com.callor.bank.service.BuyerService;

public class AccServiceImplV1 implements AccService{
	/*
	 * 신규계좌 등록하기
	 * 1. 고객번호를 입력받고 
	 * 2. 고객번호의 고객정보가 있는가 확인
	 *    BuyerServiceImplV1.getBuyer() method 를 사용하여 고객정보 찾기
	 *    없으면 "고객정보를 등록하세요"라고 메시지 표현
	 * 3. 고객번호가 있으면 신규 계좌를 생성 : List<AccDto> type accList 에 추가
	 * 
	 */

	protected List<AccDto> accList;
	protected Scanner scan;
	public AccServiceImplV1() {
		accList = new ArrayList<>();
		scan = new Scanner(System.in);
	}
	@Override
	public void accInit() {
		BuyerService buService = new BuyerSeriviceImplV1A();
		String buId = scan.nextLine();
		AccDto acDto = new AccDto();
		buService.getBuyer(buId);
		if(buId.equals(null)) {
			System.out.println("고객정보를 등록하세요");
		} else {
			String acNum = scan.nextLine();
			String acDiv = scan.nextLine();
			String acTime = scan.nextLine();
			acDto.acNum = acNum;
			acDto.acDiv = acDiv;
			acDto.acTime = Integer.valueOf(acTime);
			accList.add(acDto);
		}
	}

	@Override
	public void inout() {
	}

	@Override
	public void printAccList() {
		System.out.println(accList.toString());
		
	}

	@Override
	public void saveAccList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loadAccList() {
		// TODO Auto-generated method stub
		
	}

}
