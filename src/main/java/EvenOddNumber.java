package com.qualizeal.javaapp05.operation;

public class EvenOddNumber { 
	public String defineEvenNumber() {
		return "Even Number";
	}
	public String  defineOddNumber() {
		return "Odd Number";
	}
	public String verifyIfNumberIsEvenOrOdd(int num) {
		if (num % 2==0) {
			return defineEvenNumber();
		}
		else if(num!=0) {
			return defineOddNumber();			
		}
		else if(num<0) {
			return "-1";
		} else {
			return "-2";
		}
	}
}
