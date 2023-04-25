package com.callor.claases_exec;

import com.callor.claases_module.ServiceA;

public class ExecA {

	public static void main(String[] args) {
		
		int intKor = (int)(Math.random() * 50) + 51;
		int intEng = (int)(Math.random() * 50) + 51;
		int intMath = (int)(Math.random() * 50) + 51;
		int intHis = (int)(Math.random() * 50) + 51;
		int intMus = (int)(Math.random() * 50) + 51;
		int intArt = (int)(Math.random() * 50) + 51;
		int intSpo = (int)(Math.random() * 50) + 51;
		
		ServiceA serviceA = new ServiceA();
		serviceA.score(intKor, intEng, intMath, intHis, intMus,
				intArt, intSpo);
	}
}
