package com.qualizeal.javaapp05.operation;

public class EvenOddNumber {
	public String defineEvenNumber() {
		return "Even Number is something which should give 0 as remainder when it is divisible by 2";
	}
	
	public String defineOddNumber() {
		return "Odd Number is something which should not give 0 as remainder when it is divisible by 2";
	}
	
	public String verifyIfNumberIsEvenOrOdd(int number1) {
		String result = "";

		if (number1 < 0){
			return "-1";
		} else if (number1 == 0) {
			return "-2";
		} else if (number1 % 2 == 0){
			result = "Even Number";
		}else {
			result = "Odd Number";
		}
		return result;
		
	}
}
