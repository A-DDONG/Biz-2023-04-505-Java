package com.callor.classes.exec;

public class ClassB {

	public static void main(String[] args) {

		int[] nums = new int[10];
		int index = 0;

		for (int i = 0; i < 10; i++) {
			nums[i] = (int) (Math.random() * 50) + 51;
		}

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					index = nums[i];
					nums[i] = nums[j];
					nums[j] = index;
				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%d\t",nums[i]);
		}

	}

}
