package com.callor.claases_arrays;

public class ArrayE {

	public static void main(String[] args) {

		int[] nums = new int[10];

		for (int i = 0; i < 10; i++) {
			nums[i] = i + 1;
		}
		for (int i = 0; i < 10; i++) {
			if (nums[i] % 2 == 0) {
				System.out.println(nums[i]);
			}
		}

		for (int i = 0; i < 10; i++) {
			int index;
			for (index = 2; index < nums[i]; index++) {
				if (nums[i] % index == 0) {
					break;
				} 
			}
			if(nums[i] <= index) {
				System.out.println(nums[i] + " 는 소수");
			} else {
				System.err.println(nums[i] + " 는 소수 아님");
			}
		}
	}
}