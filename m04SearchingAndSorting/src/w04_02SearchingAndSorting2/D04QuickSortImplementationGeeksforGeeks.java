package w04_02SearchingAndSorting2;

//Java program for implementation of QuickSort
class D04QuickSortImplementationGeeksforGeeks{
	 /* This function takes last element as pivot,
	    places the pivot element at its correct
	    position in sorted array, and places all
	    smaller (smaller than pivot) to left of
	    pivot and all greater elements to right
	    of pivot */
	 int partition(int arr[], int low, int high){
	     int pivot = arr[high];
	     int i = (low-1); // index of smaller 
	     		
	     for (int j=low; j<high; j++)
	     {
	         // If current element is smaller than or
	         // equal to pivot
	         if (arr[j] <= pivot)
	         {
	    	     /*array: {10,9,8,7,6,5,4,3,2,1}*/

	        	 i++;	
	             int temp = arr[i];
	             arr[i] = arr[j];
	             arr[j] = temp;
	         }
	     }
	
	     // swap arr[i+1] and arr[high] (or pivot)
	     int temp = arr[i+1];
	     arr[i+1] = arr[high];
	     arr[high] = temp;
	     System.out.println(i+1);
	     return i+1;
	 }
	
	
	 /* The main function that implements QuickSort()
	   arr[] --> Array to be sorted,
	   low  --> Starting index,
	   high  --> Ending index */
	 void sort(int arr[], int low, int high)
	 {
	     if (low < high)
	     {
	         /* pi is partitioning index, arr[pi] is
	           now at right place */
	
	    	 int pi = partition(arr, low, high);
	    	 for(int k=0;k<arr.length;k++){
	    		 System.out.print(arr[k]+" ");
	    	 }
	    	 System.out.println();
	         // Recursively sort elements before
	         // partition and after partition
	         sort(arr, low, pi-1);
	         sort(arr, pi+1, high);
	     }
	 }
	
	 /* A utility function to print array of size n */
	 static void printArray(int arr[])
	 {
	     int n = arr.length;
	     for (int i=0; i<n; ++i)
	         System.out.print(arr[i]+" ");
	     System.out.println();
	 }
	
	 // Driver program
	 public static void main(String args[])
	 {
	     int arr[] = {10,9,8,7,6,5,4,3,2,1};
	     int n = arr.length;
	
	     D04QuickSortImplementationGeeksforGeeks ob = new D04QuickSortImplementationGeeksforGeeks();
	     
	     ob.sort(arr, 0, n-1);
	
	     System.out.println("sorted array");
	     printArray(arr);
	 }
}