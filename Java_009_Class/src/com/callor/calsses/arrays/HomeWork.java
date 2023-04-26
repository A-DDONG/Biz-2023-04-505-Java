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

		scores[0].stNum = "0001";
		scores[0].stName = "홍길동";
		scores[0].scKor = scoreService.getScore();
		scores[0].scEng = scoreService.getScore();
		scores[0].scMath = scoreService.getScore();

		scores[1].stNum = "0002";
		scores[1].stName = "이몽룡";
		scores[1].scKor = scoreService.getScore();
		scores[1].scEng = scoreService.getScore();
		scores[1].scMath = scoreService.getScore();

		scores[2].stNum = "0003";
		scores[2].stName = "성춘향";
		scores[2].scKor = scoreService.getScore();
		scores[2].scEng = scoreService.getScore();
		scores[2].scMath = scoreService.getScore();

		scores[3].stNum = "0004";
		scores[3].stName = "장보고";
		scores[3].scKor = scoreService.getScore();
		scores[3].scEng = scoreService.getScore();
		scores[3].scMath = scoreService.getScore();

		scores[4].stNum = "0005";
		scores[4].stName = "임꺽정";
		scores[4].scKor = scoreService.getScore();
		scores[4].scEng = scoreService.getScore();
		scores[4].scMath = scoreService.getScore();

		scores[5].stNum = "0006";
		scores[5].stName = "김철수";
		scores[5].scKor = scoreService.getScore();
		scores[5].scEng = scoreService.getScore();
		scores[5].scMath = scoreService.getScore();

		scores[6].stNum = "0007";
		scores[6].stName = "박영수";
		scores[6].scKor = scoreService.getScore();
		scores[6].scEng = scoreService.getScore();
		scores[6].scMath = scoreService.getScore();

		scores[7].stNum = "0008";
		scores[7].stName = "최유리";
		scores[7].scKor = scoreService.getScore();
		scores[7].scEng = scoreService.getScore();
		scores[7].scMath = scoreService.getScore();

		scores[8].stNum = "0009";
		scores[8].stName = "조나단";
		scores[8].scKor = scoreService.getScore();
		scores[8].scEng = scoreService.getScore();
		scores[8].scMath = scoreService.getScore();

		scores[9].stNum = "0010";
		scores[9].stName = "김갑순";
		scores[9].scKor = scoreService.getScore();
		scores[9].scEng = scoreService.getScore();
		scores[9].scMath = scoreService.getScore();

		int korTotal = scores[0].scKor;
		korTotal += scores[0].scKor;
		korTotal += scores[1].scKor;
		korTotal += scores[2].scKor;
		korTotal += scores[3].scKor;
		korTotal += scores[4].scKor;
		korTotal += scores[5].scKor;
		korTotal += scores[6].scKor;
		korTotal += scores[7].scKor;
		korTotal += scores[8].scKor;
		korTotal += scores[9].scKor;

		int engTotal = scores[0].scEng;
		engTotal += scores[1].scEng;
		engTotal += scores[2].scEng;
		engTotal += scores[3].scEng;
		engTotal += scores[4].scEng;
		engTotal += scores[5].scEng;
		engTotal += scores[6].scEng;
		engTotal += scores[7].scEng;
		engTotal += scores[8].scEng;
		engTotal += scores[9].scEng;

		int mathTotal = scores[0].scMath;
		mathTotal += scores[1].scMath;
		mathTotal += scores[2].scMath;
		mathTotal += scores[3].scMath;
		mathTotal += scores[4].scMath;
		mathTotal += scores[5].scMath;
		mathTotal += scores[6].scMath;
		mathTotal += scores[7].scMath;
		mathTotal += scores[8].scMath;
		mathTotal += scores[9].scMath;

		System.out.println("=".repeat(70));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(70));

		scoreService.scorePrint(scores[0]);
		scoreService.scorePrint(scores[1]);
		scoreService.scorePrint(scores[2]);
		scoreService.scorePrint(scores[3]);
		scoreService.scorePrint(scores[4]);
		scoreService.scorePrint(scores[5]);
		scoreService.scorePrint(scores[6]);
		scoreService.scorePrint(scores[7]);
		scoreService.scorePrint(scores[8]);
		scoreService.scorePrint(scores[9]);

		System.out.println("-".repeat(70));

		scoreService.scoreTotalPrint(korTotal, engTotal, mathTotal);

		System.out.println("=".repeat(70));
	}
}
