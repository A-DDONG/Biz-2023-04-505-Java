package com.callor.calsses.exec;

public class ExecH {

	public static void main(String[] args) {

		int[] nums = new int[10];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 50 + 51);
		}

		// 조건에 맞는 개수와 조건에 맞는 값의 합계를 계산
		// 개수와 합계를 저장할 변수를 먼저 선언
		int count = 0;
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 3 == 0) {
				count++;
				// sum = nums[i]; 마지막 값만 저장
				sum += nums[i]; // 누적(계속 더하기)
			}
		}
		System.out.println("3의 배수의 개수 : " + count);
		System.out.println("3의 배수의 합계 : " + sum);
	}
}
