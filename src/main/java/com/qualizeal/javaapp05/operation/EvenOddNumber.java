package com.qualizeal.javaapp05.operation;

public class EvenOddNumber{
	public String defineEvenNumber() {
		return "Even number is an integer which is exactly divisible by 2";
	}
		public String defineOddNumber() {
			return "Odd number is an integer which is not exactly divisible by 2";
		}
		public String verifyIfNumberIsEvenOrOdd(int number) {
			
			if(number < == 0) {
				return "-1";
			}
				if(number > == 0) {
					return "-2";
				}
				if(number % 2 ==0) {
					return "Even Number";
				}
				else {
					return "Odd Number";
				}
							
		}
	}
	

