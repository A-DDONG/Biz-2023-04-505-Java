package com.callor.classes.exec;

import com.callor.classes.module.ServiceD;

public class ExecM {

	public static void main(String[] args) {
		
		ServiceD serviceD = new ServiceD();
		
		int num1 = (int)(Math.random() * 50) + 51;
		int num2 = (int)(Math.random() * 50) + 51;
		
		serviceD.add(num1, num2);
	}
}
