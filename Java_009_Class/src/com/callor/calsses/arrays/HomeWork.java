package com.callor.calsses.arrays;

import com.callor.calsses.model.ScoreDto;
import com.callor.calsses.service.ScoreServiceA;

public class HomeWork {

	public static void main(String[] args) {

		ScoreDto[] scores = new ScoreDto[10];
		for (int index = 0; index < scores.length; index++) {
			scores[index] = new ScoreDto();
		}

		ScoreServiceA scoreService = new ScoreServiceA();

		for (int i = 0; i < scores.length; i++) {
			scores[i].stNum = "000" + (i + 1);
			if (i + 1 > 9) {
				scores[i].stNum = "00" + (i + 1);
			}
		}
		scores[0].stName = "홍길동";
		scores[1].stName = "이몽룡";
		scores[2].stName = "성춘향";
		scores[3].stName = "장보고";
		scores[4].stName = "임꺽정";
		scores[5].stName = "김철수";
		scores[6].stName = "박영수";
		scores[7].stName = "최유리";
		scores[8].stName = "조나단";
		scores[9].stName = "김갑순";

		for (int i = 0; i < scores.length; i++) {
			scores[i].scKor = scoreService.getScore();
			scores[i].scEng = scoreService.getScore();
			scores[i].scMath = scoreService.getScore();
		}

		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		for (int i = 0; i < scores.length; i++) {
			korTotal += scores[i].scKor;
			engTotal += scores[i].scEng;
			mathTotal += scores[i].scMath;
		}

		System.out.println("=".repeat(70));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(70));
		
		for(int i=0 ; i<scores.length ; i++) {
			scoreService.scorePrint(scores[i]);
		}

		System.out.println("-".repeat(70));

		scoreService.scoreTotalPrint(korTotal, engTotal, mathTotal);
		System.out.println("=".repeat(70));
	}
}
