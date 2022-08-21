package com.exceptions;

import java.util.Scanner;

public class TestException {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			try {
				int num1= scanner.nextInt();
				int num2 = scanner.nextInt();
				
				try {
					int res = num1/num2;
					System.out.println(res);
				}
				catch(ArithmeticException e) {
					System.out.println("Division with zero is not possible.");
				}
			}
			catch(Exception e) {
				System.out.println("Only integers are allowed.");
			}
		}
	}

}
