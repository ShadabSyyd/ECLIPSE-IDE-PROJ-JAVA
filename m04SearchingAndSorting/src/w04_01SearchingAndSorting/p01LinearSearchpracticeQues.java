package w04_01SearchingAndSorting;

import java.util.Scanner;

public class p01LinearSearchpracticeQues {
	public int numElement,searchElement;
	public int arr[];
	public boolean status=false;
	Scanner sc=new Scanner(System.in);
	
	public void implementationOfLinearSearch() {
		System.out.println("Enter the num of elements you want to have in array");
		numElement=sc.nextInt();
		arr=new int[numElement];
		
		System.out.println("Enter the elements now");
		insertValues();
		printValues();
		
		System.out.println("Enter the elements you want to search");
		searchElement=sc.nextInt();	
		searchValue(searchElement);
	}

 

	public void insertValues() {
	
	// Your code here...
		for(int i=0;i<numElement;i++) {
			System.out.println("Enter the num you want to have at postion "+i+":");
			arr[i]=sc.nextInt();
		}
	
	}

 

	public void printValues() {
	
	// Your code here...
		for(int i=0;i<numElement;i++) {
			
			System.out.print("Values at position "+i+"is: "+arr[i]+" \n");
		}
	}	

	public void searchValue(int value) {
	
	// Your code here...
		for(int i=0;i<numElement;i++) {
			if(arr[i]==value) {
				System.out.println("Value "+value+" is present at index "+i);
				status=true;
			}
			
		}
		if(status==false) {
			System.out.println("Value not found");			
		}
	}

	public static void main(String[] args) {
	
	
		p01LinearSearchpracticeQues linearsearch = new p01LinearSearchpracticeQues();
	
		linearsearch.implementationOfLinearSearch();
	
	}

}

/*
Description
Write a program to implement linear search where you 

Ask the user to input the number of elements to insert. 
Create an array of the size required and accept values from the user.
Search for a value based on the user's choice.
Print the output.
*/