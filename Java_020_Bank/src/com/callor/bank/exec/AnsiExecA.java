package com.callor.bank.exec;

import com.callor.bank.utils.AnsiConsol;

public class AnsiExecA {
	
	public static void main(String[] args) {
		System.out.println(AnsiConsol.BLACK("김한비"));
		System.out.println(AnsiConsol.RED("김한비"));
		System.out.println(AnsiConsol.GREEN("김한비"));
		System.out.println(AnsiConsol.YELLOW("김한비"));
		System.out.println(AnsiConsol.BLUE("김한비"));
		System.out.println(AnsiConsol.PURPLE("김한비"));
		System.out.println(AnsiConsol.CYAN("김한비"));
		System.out.println(AnsiConsol.WHITE("김한비"));
		
		System.out.println(AnsiConsol.message("RED", "김한비만세"));
	}
}
