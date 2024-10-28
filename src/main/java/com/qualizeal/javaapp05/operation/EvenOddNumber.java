package com.qualizeal.javaapp05.operation;

public class EvenOddNumber {
	
	public String defineEvenNumber() {
        return "Any number is divisible by 2 that is an even number.";
	}
	
	
	public String defineOddNumber() {
        return "Any number is not divisible by 2 that is an odd number.";
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
