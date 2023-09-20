package com.ass.Base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main 
{
	public static void main(String[] args) 
	{
		LoanEMICalculator calculator=new LoanEMICalculator();
		calculator.createAdmin("admin123");
		calculator.createUser("customer123");
		calculator.createLoan("admin123","customer123", 100000,0.1,5);
		
	}

}


class User
{
	String userName;

	public User(String userName) {
		super();
		this.userName = userName;
	}
	
}

class Customer extends User
{
	List<Loan> loans;

	public Customer(String userName) {
		super(userName);
	
	
	new ArrayList<>();
	
	
	
	}
}

class Admin extends User
{
	public Admin(String userName) {
		super(userName);
	
	}
	
	void createLoan(Customer customer, double principal, double rate,int year)
	{
		Loan loan=  new Loan(this, customer, principal,rate, year);
		customer.loans.add(loan);
		}
}

class Loan{
	
	
Admin admin;
Customer customer;

double principal;
double rate;
int year;

List<EMI> emi;

public Loan(Admin admin, Customer customer, double principal, double rate, int year) {
	super();
	this.admin = admin;
	this.customer = customer;
	this.principal = principal;
	this.rate = rate;
	this.year = year;
	this.emi = new ArrayList<>();
	
	calculateEmi();
}

public void calculateEmi()
{
	double interest= principal * rate * year;
	double totalAmount=principal + interest;
	double eachEmi= totalAmount/(year *12);
	
	for(int i=0; i<year * 12; i++ )
	{
		emi.add(new EMI(eachEmi));
	}
	
	
	
}



}
	
	
class EMI
{
	double amount;

	public EMI(double amount) {
		super();
		this.amount = amount;
	}
	
}


class LoanEMICalculator
{
	Map <String, User> user;

	public LoanEMICalculator() {
     
		user= new HashMap<>();
		
	}
	
	public void createUser(String userName)
	{
		user.put(userName, new Customer(userName));
	}
	
	
	public void createAdmin (String userName)
	{
		user.put(userName, new Admin(userName));
	}
	
	
	public void createLoan(String adminUserName, String customerUserName, double principal, double rate, int year)
	{
		User admin= user.get(adminUserName);
		User customer= user.get(customerUserName);
		if(admin instanceof Admin && customer instanceof Customer )
		{
			((Admin) admin).createLoan((Customer) customer, principal,rate,year);
		}
	}
	
	
}
	
	
	
	
	

