package com.qualizeal;

import com.qualizeal.javaapp05.operation.EvenOddNumber;

public class App {
	public static void main(String[] args) {
		EvenOddNumber evenOddNumber = new EvenOddNumber();
		String result = evenOddNumber.verifyIfNumberIsEvenOrOdd(20);
		System.out.println(result);
	}
}