package com.qualizeal;

import com.qualizeal.javaapp05.operation.EvenOddNumber;

public class App {
	public static void main(String[] args) {
		EvenOddNumber evenOddNumber = new EvenOddNumber();
		System.out.println(evenOddNumber.defineEvenNumber());
		System.out.println(evenOddNumber.defineOddNumber());
		System.out.println(evenOddNumber.verifyIfNumberIsEvenOrOdd(5));
		
	}
}