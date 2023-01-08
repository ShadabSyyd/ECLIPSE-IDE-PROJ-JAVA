package w04_01SearchingAndSorting;

public class D04SelectionSortImplementation {

	public static void performSelectionSort(int[] arr) { 
		for (int i=0; i < arr.length-1; i++) { 
			int index = i;
			for (int j=i; j < arr.length-1; j++) { 
				if (arr[j+1] < arr[index]) {
					index = j+1;// searching for lowest index
				}
			}

		// Swap elements

			int smallerNumber = arr[index];
			arr[index] = arr[i]; 
			arr[i]=smallerNumber;

		}
	}

	public static void main(String args[]) {

		int arr[]={100, 2, 4, 1, 56, 23, 9}; 
		System.out.println("Array Before selection Sort"); 
		for (int i = 0; i < arr.length; i++){ 
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	
		// sorting array elements using selection sort
	
		performSelectionSort(arr); 
		System.out.println("Array After selection Sort"); 
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
		
}
