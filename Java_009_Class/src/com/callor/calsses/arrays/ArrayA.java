package com.callor.calsses.arrays;

import com.callor.calsses.model.ScoreDto;

public class ArrayA {
	
	public static void main(String[] args) {
		
		ScoreDto 홍길동 = new ScoreDto();
		ScoreDto 이몽룡 = new ScoreDto();
		ScoreDto 성춘향 = new ScoreDto();
		
		홍길동.stName = "홍길동";
		홍길동.stNum = "0001";
		이몽룡.stName = "이몽룡";
		이몽룡.stNum = "0002";
		성춘향.stName = "성춘향";
		성춘향.stNum = "0003";
		
		홍길동.scKor = 88;
		홍길동.scEng = 76;
		홍길동.scMath = 77;
		이몽룡.scKor = 100;
		이몽룡.scEng = 57;
		이몽룡.scMath = 87;
		성춘향.scKor = 74;
		성춘향.scEng = 63;
		성춘향.scMath = 39;
		
		System.out.println("=".repeat(54));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(54));
		System.out.printf("%s\t%s\t%3d\t%3d\t%3d\t%3d\t%5.2f\t\n"
				,홍길동.stNum,홍길동.stName,홍길동.scKor,홍길동.scEng,
				홍길동.scMath,홍길동.getTotal(),홍길동.getAvg());
		System.out.printf("%s\t%s\t%3d\t%3d\t%3d\t%3d\t%5.2f\t\n"
				,이몽룡.stNum,이몽룡.stName,이몽룡.scKor,이몽룡.scEng,
				이몽룡.scMath,이몽룡.getTotal(),이몽룡.getAvg());
		System.out.printf("%s\t%s\t%3d\t%3d\t%3d\t%3d\t%5.2f\t\n"
				,성춘향.stNum,성춘향.stName,성춘향.scKor,성춘향.scEng,
				성춘향.scMath,성춘향.getTotal(),성춘향.getAvg());
		
		// %3d : 3자리의 자릿수를 확보 오른쪽 정령
		//  90
		//  88
		// 100

	
		
		
	}

}
