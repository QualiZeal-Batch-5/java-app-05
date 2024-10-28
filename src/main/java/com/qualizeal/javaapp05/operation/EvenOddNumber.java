package com.qualizeal.javaapp05.operation;

public class EvenOddNumber {
	public String defineEvenNumber() {
		return "Any number which is exactly divisible by 2 is an even number.";
	}
	public String defineOddNumber() {
		return "Any number which is not exactly divisible by 2 is an even number.";
	}
	public String verifyIfNumberIsEvenOrOdd(int num) {
		String result = "";
		if (num < 0 ) {
			result = "-1";
		}
		else if (num == 0 ){
			result = "-2";
		}
		else if (num % 2 == 0){
			result = "Even Number";
		}
		else {
			result = "Odd Number";
		}
		return result;
	}
}
