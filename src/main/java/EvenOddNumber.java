package com.qualizeal.javaapp05.operation;

public class EvenOddNumber {
	
	public String defineEvenNumber(){
		return "Even Number";
	}
	public String defineOddNumber(){
		return "Odd Number";
	}	
	public String verifyIfNumberIsEvenOrOdd(int num1) {
		
		String result = "";
		
		if (num1 < 0) {
			result = "-1";
		}
		else if (num1 == 0) {
			result = "-2";
		}
		else if (num1%2 == 0){
			 defineEvenNumber();
		}
		else if (num1 % 2 != 0){
			 defineOddNumber();
		}
		return result;
	}
}