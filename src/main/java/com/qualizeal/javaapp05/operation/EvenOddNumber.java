package com.qualizeal.javaapp05.operation;

public class EvenOddNumber {
	public String verifyIfNumberIsEvenOrOdd (int num) {
		if (num<0) {
			return "-1";
		}
		else if (num==0) {
			return "-2";
		}
		else if (num % 2 == 0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
	}
}
