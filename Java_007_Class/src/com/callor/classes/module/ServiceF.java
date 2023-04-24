package com.callor.classes.module;

public class ServiceF {

	public void score(int intKor, int intEng, int intMath, 
			int intHis, int intMus, int intArt, int intSpo) {
		
		int total = intKor + intEng + intMath + intHis + intMus + intArt + intSpo;
		float avg = (float)total/7;
		
		System.out.printf("총점 : %d\n평균 : %5.2f",total,avg);
		
	}
}
