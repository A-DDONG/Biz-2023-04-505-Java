package com.callor.controller.var;

public class VarA {

	public static void main(String[] args) {
		int intKor = 85;
		int intEng = 87;
		int intMath = 100;
		int intTotal = intKor + intEng + intMath;
		
		// 소수점이하 평균 오차를 찾기위해
		// 정수를 실수(float)로 강제 형변환하여 연산수행
        float floatAvg = (float)intTotal / 3f;
        
        System.out.println("=======================");
        System.out.println("국어 : " + intKor);
        System.out.println("영어 : " + intEng);
        System.out.println("수학 : " + intMath);
        System.out.println("-----------------------");
        System.out.println("총점 : " + intTotal + ", " + "평균 : " + floatAvg);
        
        System.out.println("=======================");
        System.out.printf("국어 : %3d\n",intKor);
        System.out.printf("영어 : %3d\n",intEng);
        System.out.printf("수학 : %3d\n",intMath);
        System.out.println("-----------------------");
        System.out.printf("총점 : %d, 평균 : %5.2f\n",intTotal, floatAvg);
        
	}
}
