package com.callor.score;

public class ScoreServiceA {

	public static int getScore() {
		int score = (int) (Math.random() * 50) + 51;
		return score;
	}

	public void scorePrint(ScoreDto score) {
		System.out.printf("%s\t%4d\t%4d\t%4d\t%4d\t%4d\t%4d\t%.2f\n",
				score.stNum, score.scKor, score.scEng, score.scMath,
				score.scMus, score.scArt, score.getTotal(), score.getAvg());
	}

	public void scoreTotalPrint(int kor, int eng, int math, int mus,
			int art, int total) {
		System.out.printf("총점\t%4d\t%4d\t%4d\t%4d\t%4d\t%4d\t\n", kor, eng, math, 
				mus, art, kor + eng + math + mus + art);
	}
	
	public void scoreAvgPrint(float kor, float eng, float math, float mus,
			float art, float total) {
		System.out.printf("평균\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t\t%.2f\t\n",
				kor, eng, math, mus, art, (kor+eng+math+mus+art)/5);
	}
}
