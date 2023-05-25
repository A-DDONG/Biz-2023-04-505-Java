package com.callor.bank.exec;

import com.callor.bank.service.AccService;
import com.callor.bank.service.BankService;
import com.callor.bank.service.impl.AccServiceV1;

public class DbExecF {
	public static void main(String[] args) {
		
		BankService bankService = new BankService();
		bankService.insertAccList();
	}
	
}
