package w04_01SearchingAndSorting;

public class D03BubbleSortImplementation {

	static void performBubbleSort (int[] arr) {
	
		int size = arr.length;
		
		int temp = 0;
		
		for (int i=0; i < size; i++){ 
			for(int j=0; j < (size-i-1); j++){
			
				if(arr[j]> arr[j+1]){
				
				//swap elements
				
				temp = arr[j];
				
				arr[j] = arr[j+1];
				
				arr[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) { 
		int arr[] = {100,2,4,1,56,23,9};
		
		System.out.println("Array Before Bubble Sort"); 
		for(int i=0; i < arr.length; i++){ 
		System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//sorting array elements using bubble sort
		
		performBubbleSort (arr);
		
		System.out.println("Array After Bubble Sort"); 
		for (int i=0; i < arr.length; i++){ 
		System.out.print(arr[i] + " ");
		}
	}
}
