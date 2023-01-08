package w04_02SearchingAndSorting2;

public class D01InsertionSortImplementation {

	public static void performInsertionSort (int array[]) {
	
		int n = array.length; 
		for (int j= 1; j < n; j++) {
			int key = array[j]; 
			int i=j-1;
			while ((i>-1) && (array[i]> key)) {
				array[i+1]=array[i];
				i--;
			} 
			array[i+1] = key;
			
			
		}
	
	} 

	public static void main(String a[]) {
	
		int arr[] = { 100, 2, 4, 1, 56, 23, 9 }; 
		System.out.println("Array Before insertion Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		
		} 
		System.out.println();
		
		// sorting array elements using insertion sort 
		performInsertionSort (arr);
		System.out.println("Array After insertion Sort"); 
		for (int i = 0; i < arr.length; i++) { 
			System.out.print(arr[i] +" ");
		}
	}
}
