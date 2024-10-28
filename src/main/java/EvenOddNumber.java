package com.qualizeal.javaapp05.operation;

public class EvenOddNumber {
	
	public String defineEvenNumber() {
        return "If a number is divisible by 2 then it is Even number.";
	}
	
	
	public String defineOddNumber() {
        return "If a number is not exactly divisible by 2 then it is Odd number.";
    }
	
	
	public String verifyIfNumberIsEvenOrOdd(int number) {
		
        if (number < 0) {
            return "-1"; 
        }
        if (number == 0) {
            return "-2"; 
        }
        
        if (number % 2 == 0) {
            return "Even Number"; 
        } 
        else {
            return "Odd Number"; 
        }
    }
}
