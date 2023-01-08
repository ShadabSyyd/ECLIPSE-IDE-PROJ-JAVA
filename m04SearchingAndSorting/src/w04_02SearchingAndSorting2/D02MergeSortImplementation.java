package w04_02SearchingAndSorting2;

public class D02MergeSortImplementation  {
	
	void merge(int arr[], int left, int mid, int right) {
	
		int len1 = mid-left+1; 
		int len2 = right - mid;
		
		int leftArr[] = new int[len1]; 
		int rightArr[]= new int[len2];
		
		for (int i = 0; i < len1; i++)
			leftArr[i]= arr[left+ i]; 
		for (int j = 0; j < len2; j++) 
			rightArr[j] = arr[mid+1+j];
		
		int i, j, k; 
		i = 0;
		j = 0; 
		k = left;
		
		while (i < len1 && j < len2) {
			
			if (leftArr[i] <= rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
			}
			/*
			else {
				arr[k] = rightArr[j];
				j++;
			} 
			*/
			
			else if (leftArr[i] >= rightArr[j]){
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}
		
		//When no J or I is left while after that some index are left in I or J respectively
		//So for solving the issue loops below will run

		while (i < len1) { 
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		
		while (j<len2){
			arr[k]=rightArr[j];
			j++;
			k++;
		}
	}
	
	
	void mergeSort(int arr[], int left, int right) { 
		if (left<right) {
			int mid= (left + right) / 2; 
			mergeSort (arr, left, mid); 
			mergeSort(arr, mid+1, right); 
			merge(arr, left, mid, right);
		}
	}
	
	static void display(int arr[]) { 
		int n=arr.length; 
		
		for (int i=0; i < n; ++i)
			System.out.print(arr[i]+" "); System.out.println();
	}
	
	public static void main(String args[]) { 
		int arr[] = { 6, 5, 12, 10, 9, 1, 8 };
		
		D02MergeSortImplementation ob = new D02MergeSortImplementation();
		
		System.out.println("Original array");
		
		display(arr);
		
		ob.mergeSort (arr, 0, arr.length-1);
		
		System.out.println("Sorted array"); 
		display(arr);
	}
}