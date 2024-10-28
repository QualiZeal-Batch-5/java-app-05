package com.qualizeal;

import com.qualizeal.javaapp05.operation.EvenOddNumber;

public class App {
	public static void main(String[] args) {
		EvenOddNumber IsEvenOrOdd = new EvenOddNumber();
		String res1 = IsEvenOrOdd.verifyIfNumberIsEvenOrOdd(2);
		String res2 = IsEvenOrOdd.verifyIfNumberIsEvenOrOdd(3);
		String res3 = IsEvenOrOdd.verifyIfNumberIsEvenOrOdd(-5);
		String res4 = IsEvenOrOdd.verifyIfNumberIsEvenOrOdd(0);
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
	}
}