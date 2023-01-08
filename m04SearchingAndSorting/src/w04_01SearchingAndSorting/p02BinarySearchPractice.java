package w04_01SearchingAndSorting;


import java.util.Scanner;
public class p02BinarySearchPractice {
	public int NUM_ELEMENTS, value, l, r, mid;
	public int array[];
	Scanner sc = new Scanner(System.in);
	public void implementationOfBinarySearch() {
		System.out.println("Enter the number of elementsyou want to sort:");
		NUM_ELEMENTS = sc.nextInt();
		array = new int[NUM_ELEMENTS];
		System.out.println("Enter the elements now.");
		insertValues();
		System.out.println("Enter the search value: ");
		value = sc.nextInt();
		searchValue();
	}
	public void insertValues() {
		for (int i = 0; i < NUM_ELEMENTS; i++) {
			System.out.print("Enter element at position " +i + ": ");
			array[i] = sc.nextInt();
			}
		}
	public void searchValue() {
		l = 0;
		r = array.length - 1;
		mid = l + (r - l) / 2;
		while (l <= r) {
			if (value < array[mid]) {
				// range is l to mid-1
				r = mid - 1;
			} else if (value > array[mid]) {
				// range is mid+1 to r
				l = mid + 1;
			} else {
				System.out.println("Search value " + value + "found atindex: " + mid);
				break;
				}
			mid = l + (r - l) / 2;
			}
		if (l > r) {
			System.out.println("Value not found");
		}
	}
	public static void main(String[] args) {
		p02BinarySearchPractice binarysearch = new p02BinarySearchPractice();
		binarysearch.implementationOfBinarySearch();
		}
	}







/*
Write a program to implement Binary search where

Ask users to input the number of elements and insert the elements when the system asks you to insert.
Let your code ask users to insert the search element
Enter the search element and let the program do binary search
Print the output
package com.greatlearning.searching;

 

import java.util.Scanner;

 

public class BinarySearch {

 

public void implementationOfBinarySearch() {

 

insertValues();

 

searchValue();

}

 

public void insertValues() {

// Your code here...

}

 

public void searchValue() {

// Your code here...

}

 

public static void main(String[] args) {

// Your code here...

}

}


*/