package w04_01SearchingAndSorting;
import java.util.Scanner;
public class P03BubbleSortPracticeQues {
	public int array[];
	public int NUM_ELEMENTS,temp,len,i,j;
	public boolean status=true;
	Scanner sc=new Scanner(System.in);
	
	public void insertValues(){
		for(int i=0;i<NUM_ELEMENTS;i++) {
			System.out.println("Enter the Element "+(i+1)+": ");
			array[i]=sc.nextInt();
		}
	}
//	public void sortValues() {
//		len=array.length-1;
//		for(int j=0;j<len;j++) {
//			for(i=j+1;i<array.length;i++) {
//				if(array[j]>array[i+j]) {
//					temp=array[j];
//					array[j]=array[i+j];
//					array[i+j]=temp;
//				}
//			}
	public void sortValues() {
		len = array.length - 1;
		for (int i = 0; i < len; i++) {
			j = i + 1;
			if (array[i] > array[j]) {
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				printValues();
				}
			}
		len -= 1;
	}
	public void printValues() {
		for(int i=0;i<array.length;i++) {
			System.out.println("Value at position "+i+"is "+array[i]);
		}
		System.out.println();
		
	}
	public boolean checkForStatus() {
		for(int i=0;i<array.length-1;i++) {
			if(array[i]>array[i+1]) {
				return false;
			}
		}
		return true;
	}
	public void implementationOfBubbleSort() {
		System.out.println("Enter the Number of Elements to Sort: ");
		NUM_ELEMENTS=sc.nextInt();
		array=new int[NUM_ELEMENTS];
		System.out.println("Enter the Number of Elements now: ");
		insertValues();
		
		//sort Values
		do {
			sortValues();
			status=checkForStatus();
		
		}while(status==false);
		
	}
	public static void main(String[] args) {
		P03BubbleSortPracticeQues implementation=new P03BubbleSortPracticeQues();
		implementation.implementationOfBubbleSort();
	}
}

/*
Description
Write a program to implement Bubble Sort where 

Ask users how many values they want to insert.
Create an array accordingly and input the values of users choice to the array. 
Implement Bubble sort for the array where the output prints the array after every iteration. 
Make sure that you obtain the same result when you solve manually.
 

Stub Code: 
package com.greatlearning.sorting;

import java.util.Scanner;
public class BubbleSort {

public int array[];
public int NUM_ELEMENTS, temp, len, i, j;
public boolean status = true;
Scanner sc = new Scanner(System.in);

public void implmentationOfBubbleSort() {



// Your Code here...

 

// Insert values

insertValues();

 

// Sort values();

do {

sortValues();

status = checkForStatus();

} while (status == false);

}


public void insertValues() {

// Your Code here...

}

public boolean checkForStatus() { // check if the array is sorted and return boolean value

// Your Code here...

}
public void sortValues() {

// Your Code here...

}

 

public void printValues() {

// Your Code here...

}


public static void main(String[] args) {

// Your Code here...

}

}
*/