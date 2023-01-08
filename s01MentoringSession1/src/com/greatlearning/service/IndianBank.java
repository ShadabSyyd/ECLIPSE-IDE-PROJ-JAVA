package com.greatlearning.service;
import java.util.Scanner;
import com.greatlearning.interfaces.InternetBanking;
public class IndianBank implements InternetBanking{
	
	private int bankBalance=1000;
	
	Scanner userInput=new Scanner(System.in);
	public boolean deposit() {
		//amount to deposit
		//print shortcut: sysout -> ctrl+Space
		System.out.println("Enter the Amount to be Deposited");
		int amountToDeposit=userInput.nextInt();
		
		if (amountToDeposit>0) {
			//add entered val to bankBalance
			bankBalance=bankBalance+amountToDeposit;
			System.out.println("The amount "+amountToDeposit+" is deposited "
					+ "Successfully");
			return true;
		}else{
			System.out.println("Amount Entered was invalid-less than zero");
			return false;
		}
	}
	public boolean withdraw() {
		//check balance
		//amount to withdraw
		System.out.println("Enter the amount to withdraw ");	
		int amountToWithdraw=userInput.nextInt();
		int currentAmount=bankBalance-amountToWithdraw;
		if(currentAmount>=0) {
			System.out.println("The Amount "+amountToWithdraw+" is withdrawn successfuly");
			bankBalance=currentAmount;
//			System.out.println("Do you want to display the balance- Y/N");
//			String a=userInput.nextLine();
				
			return true;
		}else {
			System.out.println("Insufficient Funds-Unable to Withdraw");
			return false;
		}
	}
	public boolean transfer() {
		OTPGenerator otpGenerator=new OTPGenerator();
		int otpGenerated=otpGenerator.generateOTP();
		System.out.println("OTP Generated is "+otpGenerated);
		
		System.out.println("Enter the OTP");
		int otpUserInput=userInput.nextInt();
		if(otpUserInput==otpGenerated) {
			System.out.println("OTP Validated Successfully");
			System.out.println("Enter the Amount to transfer");
			int amountToTransfer=userInput.nextInt();
			System.out.println("Enter the Targer 10 digit acc number");
			int targetBankAccountNo=userInput.nextInt();
//			replicate
			int currentAmount2=bankBalance-amountToTransfer;
			if(currentAmount2>=0) {
				System.out.println("The Amount "+amountToTransfer+" is transferred successfuly to"+targetBankAccountNo);
				bankBalance=currentAmount2;
				
				System.out.println("Remaining Bank Balance"+bankBalance);	
				return true;
			}else {
				System.out.println("Insufficient Funds-Unable to complete Transfer request");
				return false;
			}
		}else {
			System.out.println("OTP Entered is Invalid");
			return false;//IMP-Required because it should have another default return statement
			//else it will show error
		}
	}
	public int checkBalance() {
		return this.bankBalance;
	}
}
