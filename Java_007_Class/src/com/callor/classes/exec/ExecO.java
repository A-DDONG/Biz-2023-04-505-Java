package com.callor.classes.exec;

import com.callor.classes.module.ServiceF;

public class ExecO {

	public static void main(String[] args) {

		int intKor = (int) (Math.random() * 50) + 51;
		int intEng = (int) (Math.random() * 50) + 51;
		int intMath = (int) (Math.random() * 50) + 51;
		int intHis = (int) (Math.random() * 50) + 51;
		int intMus = (int) (Math.random() * 50) + 51;
		int intArt = (int) (Math.random() * 50) + 51;
		int intSpo = (int) (Math.random() * 50) + 51;

		ServiceF serviceF = new ServiceF();
		serviceF.score(intKor, intEng, intMath, intHis, intMus, intArt, intSpo);

	}
}
