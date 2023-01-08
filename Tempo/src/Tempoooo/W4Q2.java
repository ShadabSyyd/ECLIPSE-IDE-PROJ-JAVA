package Tempoooo;

import java.util.Arrays;

public class W4Q2 {


void quickSort(int arr[], int low, int high) {

    if (low < high) {

        int p = partition(arr, low, high);

        System.out.println(p+Arrays.toString(arr));

        quickSort(arr, low, p-1);

        quickSort(arr, p+1, high);

    }

  }

 

 int partition(int arr[], int low, int high){
    int pivot = arr[high];          //we are taking last element in array as pivot
    int i = (low - 1);                  // Index of smaller element 

    for (int j = low; j <= high- 1; j++)
    {
         if (arr[j] < pivot)
        {
            i++;                             // increment index of smaller element
            swap(arr[i], arr[j]);   // consider that the swapping functionality works as intended
        }
    }
    swap(arr[i + 1], arr[high]);
    return (i + 1);
}
void swap(int a, int b) {
	int temp;
	temp=a;
	a=b;
	b=temp;
}
public static void main(String args[]) {
	int arr[]= {9,7,5,4,3,2,1,0};
	W4Q2 ob=new W4Q2();
	ob.quickSort(arr,0, 7);
	
	}
}
