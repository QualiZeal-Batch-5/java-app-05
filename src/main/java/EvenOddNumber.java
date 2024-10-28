package com.qualizeal.javaapp05.operation;

public class EvenOddNumber {
	String s;
	public String defineEvenNumber() {

		return "Even Number";

	}

	public String defineOddNumber() {
		
		return "Odd Number";
		 
	 }
	public String verifyIfNumberIsEvenOrOdd (int num) {
		if(num % 2  == 0) {
			s = defineEvenNumber();
		}
		else if(num % 2 != 0) {
			s = defineOddNumber();
		}
		else if(num < 0) {
			s = "-1";
		}
		else if( num == 0) {
			s = "-2";
		}
		
		return s;
		
	}
}
