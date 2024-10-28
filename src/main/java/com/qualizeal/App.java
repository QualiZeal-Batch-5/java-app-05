package com.qualizeal;
 
import com.qualizeal.javaapp05.operation.EvenOddNumber;
 
public class App {
	public static void main(String[] args) {
		EvenOddNumber evenOddNumber  = new EvenOddNumber();
		evenOddNumber.defineEvenNumber();
		evenOddNumber.defineOddNumber();
		evenOddNumber.verifyIfNumberIsEvenOrOdd(10);
		
		int input =  0;
		String result = evenOddNumber.verifyIfNumberIsEvenOrOdd(input);
		System.out.println(result);
	}		
}