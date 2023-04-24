package com.callor.classes.module;

public class ServiceE {

	public void score(int intKor, int intEng, int intMath) {

		int total = intKor + intEng + intMath;
		float avg = (float) total / 3;

		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.printf("%d\t%d\t%d\t%d\t%5.2f", intKor, intEng, intMath, total, avg);
	}
}
