package com.greatlearning.main;
import java.util.Scanner;

import com.greatlearning.model.Customer;
import com.greatlearning.interfaces.InternetBanking;
import com.greatlearning.service.IndianBank;
public class DriverClass {
	public static void main(String[] args) {
		Scanner userInput=new Scanner(System.in);
		//Create Customer Object and set hardcoded values for bank acc and password
		Customer IBCustomer1=new Customer();
		IBCustomer1.setbankAccountNo("8269991988");
		IBCustomer1.setpassword("Password1");
		//User input
		//user input to be read
		System.out.println("Welcome");
		System.out.println("Enter Bank Acc number");
		String accin=userInput.nextLine();
		System.out.println("Enter the Password");
		String passin=userInput.nextLine();

		
		/*
		
		IMP- object is of InternetBanking() and referencing to IndianBank()
		Because the InternetBanking is an interface and using objects of IndianBank
		ie object declarations is in IndianBank
		
		*/
		InternetBanking indianBank=new IndianBank();
		
		
		//validate credentials from the user input
		if(IBCustomer1.getbankAccountNO().equals(accin)&&IBCustomer1.getpassword().equals(passin)) {
			System.out.println("Login is Successful");
			//give option to deposit, withdraw, transfer, and checkBalance
			int option;
			do {
				System.out.println("Choose the option below");
				System.out.println("1-Deposit\n2-Withdrawl\n3-Transfer\n4-Check Balance\n0-Logout");
				option=userInput.nextInt();
				
				//Use Switch Case
				switch(option) {
					case 0:
						option=0;
						break;
					case 1:{
						option=1;
						boolean depositStatus=indianBank.deposit();
						if(depositStatus==true) {
							System.out.println("Deposit completed");
						}else {
							System.out.println("Deposit Failed");
						}
					}break;
					
					case 2:{
						option=2;
						boolean withdrawlStatus=indianBank.withdraw();
						if(withdrawlStatus==true) {
							System.out.println("Withdrawl completed");
						}else {
							System.out.println("Withdrawl Failed");
						}
					}break;
					
					case 3:{
						option=3;
						boolean transferStatus=indianBank.transfer();
						if(transferStatus==true) {
							System.out.println("Transfer completed");
						}else {
							System.out.println("Transfer Failed");
						}
					}break;
					
					case 4:{
						option=4;
						int checkBalanceValue=indianBank.checkBalance();
						System.out.println("Balance in Account is "+checkBalanceValue);
					}break;
				}
					
			}while(option!=0);
			if(option==0) {
				System.out.println("Logout Successfull!!");
			}
			
		}else{
			System.out.println("Acc No or Password is invalid");
		}
		
		//and then be validated
	}
}
