package com.qualizeal.javaapp05.operation;

public class EvenOddNumber {
	public String defineEvenNumber() {
		return "Even Number";
	}

	public String defineOddNumber() {
		return "Odd Number";
	}

	public String verifyIfNumberIsEvenOrOdd(int num1) {
		if (num1 == 0) {
			return "-2";
		} else if (num1 < 0) {
			return "-1";
		} else if (num1 % 2 == 0) {
			return defineEvenNumber();
		}
		return defineOddNumber();
	}
}
