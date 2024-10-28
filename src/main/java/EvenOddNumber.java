
package com.qualizeal.javaapp05.operation;

public class EvenOddNumber {

   
    public String defineEvenNumber() {
        return "An even number is an integer that is exactly divisible by 2.";
    }

    // Method to define an odd number
    public String defineOddNumber() {
        return "An odd number is an integer that is not exactly divisible by 2.";
    }

    // Method to verify if a number is even or odd
    public String verifyIfNumberIsEvenOrOdd(int num) {
        // Check for negative numbers
        if (num < 0) {
            return "-1";
        }
        // Check for zero
        if (num == 0) {
            return "-2";
        }
        // Determine if the number is even or odd
        if (num % 2 == 0) {
            return "Even Number";
        } else {
            return "Odd Number";
        }
    }
}
