package com.callor.blackjack;

import java.util.Scanner;

public class BlackJack {
	/*
	 *  1.게임 시작 / 종료
	 *  2.덱만들기
	 *  3.카드 2장 배분
	 *  4.결과에 따라 진행 여부
	 *  5.반복
	 *  6.결과
	 *  
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int start;
			while(true) {
				System.out.println("게임 시작(q를 입력하면 종료)");
				try {
					start = Integer.valueOf(scan.nextInt());
					if(start.equals) {
						
					}
				} catch (Exception e) {
					System.out.println("숫자만 입력해주세요");
					continue;
				}
			}
	}
}
