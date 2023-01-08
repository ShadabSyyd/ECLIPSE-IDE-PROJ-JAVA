package w04_02SearchingAndSorting2;

import java.util.Arrays;

public class D05RadixSortImplementation{
	// function to get maximum value in array[]
	static int getMaxElement(int array[], int size){
	int max = array[0];

	for (int i = 1; i < size; i++) {
		if (array[i]> max)
			max = array[i];
	}

	return max;

	}

	// A function to do counting sort of array[] according to
	// the digit represented by exp.

	static void countSort (int array[], int size, int exp) { 
	int output[] = new int[size]; // output array

	int i;

	int count[] = new int[10]; 
	Arrays.fill(count, 0);

	// Store count of occurrences in count[] 
	for (i=0; i < size; i++) 
	count [(array[i]/exp) % 10]++;



	// Change count[i] so that count[i] now contains 
	// actual position of this digit in output[]

	for (i = 1; i < 10; i++) 
		count[i] += count[i-1]; 

	// Build the output array 
	for (i= size-1 ; i >= 0; i--) {
	output [count [(array[i] / exp) % 10]-1]=array[i];
	count [(array[i] / exp) % 10]--;
	}

	// Copy the output array to array[], so that array[] now 
	// contains sorted numbers according to current digit 
	for (i = 0; i < size; i++) {
		array[i]= output[i];
	}
	}
	// The main function that sorts array[] of size n using 
	// Radix Sort 

	static void radixsort (int array[], int size) {

	// Find the maximum number to know number of digits 
	int m = getMaxElement (array, size);


	// Do counting sort for every digit. Note that

	// instead of passing digit number, exp is passed.
	// exp is 10^i where i is current digit number

	for (int exp =1; m / exp > 0; exp *= 10)

	countSort (array, size, exp);

	}

	//function to print array

	static void printArray(int arr[], int n) { 
	for (int i = 0; i < n; i++)

	System.out.print(arr[i] +" ");

	}

	// Driver Code

	public static void main(String[] args) { 
	int array[] = { 170, 45, 75, 90, 802, 24, 2, 66 };

	int size = array.length;

	System.out.println("array before sorting"); printArray(array, size);

	radixsort (array, size);

	System.out.println();

	System.out.println("array after sorting"); printArray(array, size);
	}
	} 
