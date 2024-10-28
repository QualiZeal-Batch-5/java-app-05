package com.qualizeal;

import com.qualizeal.javaapp05.operation.EvenOddNumber;

public class App {
	public static void main(String[] args) {

		EvenOddNumber evenoddnumber = new EvenOddNumber();
		String result = evenoddnumber.verifyIfNumberIsEvenOrOdd(48);
		
		System.out.println(result);
		
	}
}