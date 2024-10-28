
package com.qualizeal.javaapp05.operation;

public class EvenOddNumber {

   
    public String defineEvenNumber() {
        return "even number.";
    }

    
    public String defineOddNumber() {
        return "odd number.";
    }

    
    public String verifyIfNumberIsEvenOrOdd(int num) {
        // Check for negative numbers
        if (num < 0) {
            return "-1";
        }
       
        if (num == 0) {
            return "-2";
        }
       
        if (num % 2 == 0) {
            return "Even Number";
        } else {
            return "Odd Number";
        }
    }
}
