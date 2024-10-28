package com.qualizeal.javaapp05.operation;

public class EvenOddNumber {
	
	public String defineEvenNumber() {
		return "Even Number";
	}
	
	public String defineOddNumber() {
		return "Odd Number";
	}
	
	public String verifyIfNumberIsEvenOrOdd(int num) {
		if(num < 0) {
			return "-1";
		}
		else if(num == 0) {
			return "-2";
		}
		else if(num % 2 == 0) {
			return defineEvenNumber();
		}
		else {
			return defineOddNumber();
		}
	}
}