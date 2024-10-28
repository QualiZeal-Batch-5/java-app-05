package com.qualizeal.javaapp05.operation;
 
public class EvenOddNumber {
	
	public String defineEvenNumber() {
        return "An even number is an integer that is exactly divisible by 2.";
	}
	
	
	public String defineOddNumber() {
        return "An odd number is an integer that is not exactly divisible by 2.";
    }
	
	
	public String verifyIfNumberIsEvenOrOdd(int number) {
		
        if (number == 0) {
            return "-2";
        }
        if (number < 0) {
            return "-1";
        }
        
        if (number % 2 == 0) {
            return "Even Number";
        }
        else {
            return "Odd Number";
        }
    }
}