package com.callor.score;

public class ArrayA {
	
	public static void main(String[] args) {
		
		String[] nums = new String[10] ;
		for(int i = 0 ; i < nums.length ; i++) {
		}
		ScoreDto[] scores = new ScoreDto[10] ;
		
		for(int i = 0 ; i < nums.length ; i++) {
			scores[i] = new ScoreDto();
		}
		ScoreServiceA scService = new ScoreServiceA();
		
		for(int i = 0 ; i < scores.length ; i++) {
			scores[i].stNum = String.format("23%03d", (i + 1));
			scores[i].scKor = ScoreServiceA.getScore();
			scores[i].scEng = ScoreServiceA.getScore();
			scores[i].scMath = ScoreServiceA.getScore();
			scores[i].scMus = ScoreServiceA.getScore();
			scores[i].scArt = ScoreServiceA.getScore();
		}
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		int musTotal = 0;
		int artTotal = 0;
		int allTotal = 0;
		float avgTotal = 0;
		float korAvg = 0;
		float engAvg = 0;
		float mathAvg = 0;
		float musAvg = 0;
		float artAvg = 0;
		float allAvg = 0;

		for (int i = 0; i < scores.length; i++) {
			korTotal += scores[i].scKor;
			engTotal += scores[i].scEng;
			mathTotal += scores[i].scMath;
			musTotal += scores[i].scMus;
			artTotal += scores[i].scArt;
			allTotal += scores[i].getTotal();
			avgTotal += (float) scores[i].getAvg();
			
			korAvg = (float) korTotal / scores.length ;
			engAvg = (float) engTotal / scores.length ;
			mathAvg = (float) mathTotal / scores.length ;
			musAvg = (float) musTotal / scores.length ;
			artAvg = (float) artTotal / scores.length ;
			allAvg = (float) avgTotal / scores.length ;
			
		}
		System.out.println("=".repeat(70));
		System.out.println("* 한울 고교 성적 리스트 *");
		System.out.println("=".repeat(70));
		System.out.println("학번\t국어\t영어\t수학\t음악\t미술\t총점\t평균");
		System.out.println("-".repeat(70));
		for(int i = 0 ; i < scores.length ; i++) {
			scService.scorePrint(scores[i]);
	}
		System.out.println("-".repeat(70));
		scService.scoreTotalPrint(korTotal, engTotal, mathTotal, musTotal, artTotal, allTotal);
		scService.scoreAvgPrint(korAvg, engAvg, mathAvg, musAvg, artAvg, allAvg);
		System.out.println("=".repeat(70));
	}
}
