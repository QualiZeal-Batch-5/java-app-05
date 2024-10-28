package com.qualizeal.javaapp05.operation;

public class EvenOddNumber {

    public String defineEvenNumber() {
        return "Even Number";
    }

    public String defineOddNumber() {
        return "Odd Number";
    }

    public String verifyIfNumberIsEvenOrOdd(int number) {
        if (number < 0) {
            return "-1";
        }
        if (number == 0) {
            return "-2";
        }
        if (number % 2 == 0) {
            return defineEvenNumber();
        } 
		else {
            return defineOddNumber();
        }
    }
}
