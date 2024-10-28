package com.qualizeal;

import com.qualizeal.javaapp05.operation.EvenOddNumber;

public class MainProgram {
	
	public static void main(String[] args){
		
		EvenOddNumber evenOddNumber = new EvenOddNumber();
		String result = EvenOddNumber.verifyIfNumberIsEvenOrOdd(10);
		
		System.out.println(result);
	}
}