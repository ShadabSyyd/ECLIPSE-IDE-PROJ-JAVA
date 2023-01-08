package w04_02SearchingAndSorting2;

public class C32Temp{
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
	    	     /*array: {3, 4, 7, 6, 1, 5, 2}*/

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
	
	     return i+1;
	 }
	 static void printArray(int arr[])
	 {
	     int n = arr.length;
	     for (int i=0; i<n; ++i)
	         System.out.print(arr[i]+" ");
	     System.out.println();
	 }
	 public static void main(String args[])
	 {
	     int arr[] = {3, 4, 7, 6, 1, 5, 2};
	     int n = arr.length;
	
	     C32Temp ob = new C32Temp();
	     C32Temp ob1 = new C32Temp();
	     C32Temp ob2 = new C32Temp();
	     C32Temp ob3 = new C32Temp();
	     C32Temp ob4 = new C32Temp();
	     C32Temp ob5 = new C32Temp();
	     
	     ob.partition(arr, 0, n-1);
//	     ob1.partition(arr, 0, n-1);
//	     ob2.partition(arr, 0, n-1);
//	     ob3.partition(arr, 0, n-1);
//	     ob.partition(arr, 0, n-1);
//	     ob.partition(arr, 0, n-1);
		 
	     System.out.println("sorted array");
	     printArray(arr);
	 }
}