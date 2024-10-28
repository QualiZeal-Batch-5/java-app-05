package com.qualizeal.javaapp05.operation;

public class EvenOddNumber {
	
	public String defineEvenNumber() {
        return "Any number that can be exactly divisible by 2.";
	}
	
	
	public String defineOddNumber() {
        return "Any number that cannot be exactly divisible by 2.";
    }
	
	
	public String verifyIfNumberIsEvenOrOdd(int num) {
		
        if (num < 0) {
            return "-1"; 
        }
        if (num == 0) {
            return "-2"; 
        }
        
        if (num % 2 == 0) {
            return "Even Number"; 
        } 
        else {
            return "Odd Number"; 
        }
    }
}
