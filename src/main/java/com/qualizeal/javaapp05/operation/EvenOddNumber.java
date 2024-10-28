package com.qualizeal.javaapp05.operation;

public class EvenOddNumber {
	
	public String defineEvenNumber() {
		return "Even Number";
	}
	
	public String defineOddNumber() {
		return "Odd Number";
	}
	
	public String verifyIfNumberIsEvenOrOdd(int number) {
		String answer = " ";
		
		if(number % 2 == 0) {
			answer = defineEvenNumber();
		}
		
		if(number % 2 != 0) {
			answer = defineOddNumber();
		}
		
		if(number < 0) {
			answer = "-1";
		}
		
		if(number == 0) {
			answer = "-2";
		}
		return answer;
	}
}
