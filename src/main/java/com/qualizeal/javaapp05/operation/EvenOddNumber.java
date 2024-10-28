package com.qualizeal.javaapp05.operation;

public class EvenOddNumber {
	public String defineEvenNumber() {
		return "Even Number : Any Number that can be exactly divided by 2";
	}

	public String defineOddNumber() {
		return "Odd Number : Any Number that cannnot be exactly divided by 2";
	}

	public String verifyIfNumberIsEvenOrOdd(int number) {
		String result = "";
		if (number < 0 ) {
			result = "-1";
		}else if (number == 0 ) {
			result = "-2";
		}else if (number % 2 == 0) {
			result = "Even Number";
		}else {
			result = "Odd Number";
		}
		return result;
	}
}
		
				
	

