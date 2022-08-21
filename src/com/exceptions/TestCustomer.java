package com.exceptions;

import java.util.Scanner;

public class TestCustomer {

	public static void main(String[] args) {
			try (Scanner scanner = new Scanner(System.in)) {
				String custNo,custName,category;
				System.out.println("Input Customer Details - ");
				System.out.println();
				
				try {
					
				
					System.out.println("Enter Customer Number");
					custNo = scanner.nextLine();
					System.out.println("Enter Customer Name");
					custName = scanner.nextLine();
					System.out.println("Enter Customer Category");
					category = scanner.nextLine();
				
				
					System.out.println();
				
					Customer c = new Customer(custNo,custName,category);
					//c.initializeList();
					System.out.println();
					System.out.println("Customer Details - \n");
					System.out.println(c.getDetails());

				}
				catch(InvalidInputException e) {
					System.out.println(e.getMessage().toString());
				}
			}
		
	}

}
