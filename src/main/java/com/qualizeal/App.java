package com.qualizeal;
import com.qualizeal.javaapp05.operation.EvenOddNumber;
public class App {
	public static void main(String[] args) {
		
		EvenOddNumber evenOddNumber = new EvenOddNumber();
		
			System.out.println(evenOddNumber.verifyIfNumberIsEvenOrOdd(5));
			System.out.println(evenOddNumber.verifyIfNumberIsEvenOrOdd(8)); 
			System.out.println(evenOddNumber.verifyIfNumberIsEvenOrOdd(-9)); 
			System.out.println(evenOddNumber.verifyIfNumberIsEvenOrOdd(0));
			
	}
}