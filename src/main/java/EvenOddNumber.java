package com.qualizeal.javaapp05.operation;
public class EvenOddNumber {
	public String EvenorOdd(int num1) {
		if(num1<0) {
			return "-1";
		}
		else if(num1==0) {
			return "-2";
		}
		else if(num1%2 == 0) {
			return " It is Even Number";
		}	
		else{
			return "It is Odd Number";
		}	
	}
}