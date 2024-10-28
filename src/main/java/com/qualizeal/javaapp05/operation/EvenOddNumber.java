package com.qualizeal.javaapp05.operation;

public class EvenOddNumber {
	
	public String defineEvenNumber() {
        return "A number is said to an  even number if it is exactly divisible by 2.";
	}
	
	
	public String defineOddNumber() {
        return "A number is said to an odd number if it is not exactly divisible by 2.";
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
