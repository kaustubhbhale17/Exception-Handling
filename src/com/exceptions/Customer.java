package com.exceptions;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String custNo;
	private String custName;
	private String category;
	
	//reason for creating this function -> initialization applies to an object, or an instance, 
	//and in the declaration in the class there is no object or instance; you don't have that until you start constructing.
	public List<String> initializeList() {
		List<String> categories = new ArrayList<String>();
		categories.add("Platinum");
		categories.add("Gold");
		categories.add("Silver");
		return categories;
	}
	
	public boolean containsCategory(String category) {
		List<String> cat = initializeList();
		return cat.contains(category);
	}
	
	public Customer(String custNo, String custName, String category) throws InvalidInputException {
		if(!(custNo.startsWith("C") || custNo.startsWith("c")))
			throw new InvalidInputException("Invalid Number");
		else if(custName.length()<4)
			throw new InvalidInputException("Invalid Name");
		else if(!containsCategory(category))
			throw new InvalidInputException("Invalid Category");
		else {
			this.custNo=custNo;
			this.custName=custName;
			this.category=category;
		}
	}
	
	
	public String getCustNo() {
		return custNo;
	}
	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getDetails() {
		return "CustNo - "+custNo+"\nCustName - "+custName+"\nCategory- "+category;
	}

}
