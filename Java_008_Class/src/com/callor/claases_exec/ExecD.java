package com.callor.claases_exec;

public class ExecD {

	public static void main(String[] args) {
		
		int intKor1 = (int)(Math.random() * 50) + 51;
		int intKor2 = (int)(Math.random() * 50) + 51;
		int intKor3 = (int)(Math.random() * 50) + 51;
		int intKor4 = (int)(Math.random() * 50) + 51;
		int intKor5 = (int)(Math.random() * 50) + 51;
		
		int intTotal = intKor1;
		intTotal += intKor2;
		intTotal += intKor3;
		intTotal += intKor4;
		intTotal += intKor5;
		float intAvg = (float)intTotal / 5;
		
		System.out.printf("국어점수 합계 : %d\n국어점수 평균 : %5.2f",
				intTotal, intAvg);
	}
	
	
}
