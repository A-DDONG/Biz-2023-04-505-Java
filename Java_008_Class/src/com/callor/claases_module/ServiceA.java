package com.callor.claases_module;

public class ServiceA {

	public void score(int intKor, int intEng, int intMath, int intHis, int intMus, int intArt, int intSpo) {

		int total = intKor + intEng + intMath + intHis + intMus + intArt + intSpo;
		float avg = (float) total / 3;

		System.out.println("국어 : " + intKor);
		System.out.println("영어 : " + intEng);
		System.out.println("수학 : " + intMath);
		System.out.println("국사 : " + intHis);
		System.out.println("음악 : " + intMus);
		System.out.println("미술 : " + intArt);
		System.out.println("체육 : " + intSpo);
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);

	}
}
