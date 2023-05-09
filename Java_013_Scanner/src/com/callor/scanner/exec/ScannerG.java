package com.callor.scanner.exec;

import java.util.Iterator;
import java.util.Scanner;

public class ScannerG {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] nums = new int[6];
		int sNums = 0;
		
		while(true) {
			int rndNum = (int)(Math.random() * 45) + 1;
			int sIndex;
			for(sIndex = 0 ; sIndex < nums.length ; sIndex++) {
				if(nums[sIndex] == rndNum) {
					break;
				}
			}
			if(sIndex < nums.length) {
				continue;
			}
			System.out.println(rndNum);
			
			while(true) {
				System.out.print("정수 입력(QUIT : 종료) >> ");
				String strNum = scan.nextLine();
				if(strNum.equals("QUIT")) {
					System.out.println("게임을 중단");
					return;
				}
				int intNum = 0;
				try {
					intNum = Integer.valueOf(strNum);
				} catch (Exception e) {
					System.err.println("입력값 오류");
					System.err.println("정수만 입력하세요");
					continue;
				}
				if (intNum < 0 || intNum > 45) {
					System.err.println("1 ~ 45 범위의 정수만 입력하세요");
				} else if (rndNum == intNum) {
					System.out.println("참 잘했어요");
					nums[sNums++] = rndNum;
					break;
				} else if (rndNum > intNum) {
					System.err.println("입력값이 작아요");
				} else if (rndNum < intNum) {
					System.err.println("입력값이 커요");
				}
				
			}
			if( sNums >= nums.length) {
				break;
			}
		}
		System.out.println("GAME OVER");
	    for(int i = 0 ; i < nums.length; i++) {
	    	for(int j = i + 1 ; j < nums.length ; j++) {
	    		if(nums[i] > nums[j]);
	    		int num = nums[i];
	    		nums[i] = nums[j];
	    		nums[j] = num;
	    		}
	    	}
	}
}
