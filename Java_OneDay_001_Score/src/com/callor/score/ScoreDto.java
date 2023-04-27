package com.callor.score;

public class ScoreDto {

	public String stNum;
	public int scKor;
	public int scEng;
	public int scMath;
	public int scMus;
	public int scArt;

	public int getTotal() {
		int total = this.scKor;
		total += this.scEng;
		total += this.scMath;
		total += this.scMus;
		total += this.scArt;
		return total;
	}

	public float getAvg() {
		float avg = (float) this.getTotal() / 5;
		return avg;
	}

}
