package com.callor.classes.module;

public class ServiceB {

	public void score(String 이름, int 국어, int 영어, int 수학) {
		
		int 총점 = 국어 + 영어 + 수학;
		float 평균 = (float)총점/3;
		System.out.println("====================================");
		System.out.println("이름\t국어  영어  수학  총점  평균");
		System.out.println("------------------------------------");
		System.out.printf("%s\t %-3d   %-3d   %-3d   %d  %-5.1f\n", 이름,국어,영어,수학,총점,평균);
		System.out.println("====================================");
	}
}
