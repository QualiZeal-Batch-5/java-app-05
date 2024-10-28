package com.qualizeal.javaapp05.operation;
 
 public class EvenOddNumber {
	String result = "";
	public String verifyIfNumberIsEvenOrOdd(int num1){
		
		if(num1 < 0){
			result = "-1";
		}else if(num1 == 0){
			result = "-2";
		}else if(num1 % 2 == 0){
			defineEvenNumber();
		}else if(num1 % 2 != 0){
			defineOddNumber();
		}
		
		return result;
	}
	
	public String defineEvenNumber(){
		result = "Even Number";
		
		return result;
	}
	
	public String defineOddNumber(){
		result = "Odd Number";
		
		return result;
	}
 }
