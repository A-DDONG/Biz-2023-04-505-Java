package com.callor.claases_arrays;

public class ArrayC {

	public static void main(String[] args) {
		int[] nums = new int[10];
		
		nums[0] = 33;
		nums[1] = 31;
		nums[2] = 15;
		nums[3] = 88;
		nums[4] = 95;
		nums[5] = 28;
		nums[6] = 17;
		nums[7] = 64;
		nums[8] = 74;
		nums[9] = 69;
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		System.out.println(nums[4]);
		System.out.println(nums[5]);
		System.out.println(nums[6]);
		System.out.println(nums[7]);
		System.out.println(nums[8]);
		System.out.println(nums[9]);
		
		// num0, num1, num2
		for(int index = 0 ; index < 10 ; index++) {
			System.out.println(nums[index]);
			//
			// System.out.println(numindex);
		}
		
	}
}
