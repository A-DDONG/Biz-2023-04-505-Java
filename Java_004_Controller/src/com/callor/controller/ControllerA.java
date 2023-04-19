package com.callor.controller;

public class ControllerA {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			int rndnum = (int) (Math.random() * 50) + 51;
			System.out.print(rndnum);
			if (rndnum < 51 || rndnum > 100) {
				System.err.println(" Over");
			} else {
				System.out.println(" OK");
			}
		}
	}

}