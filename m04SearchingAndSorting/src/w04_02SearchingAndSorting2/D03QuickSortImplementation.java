package w04_02SearchingAndSorting2;
import java.util.Scanner;

public class D03QuickSortImplementation {
	int partition(int a[],int low,int high) {
		
	int p,i,j,temp;
	
	i=low+1;
	j=high;
	p=a[low];
	while(low<high){
		while(a[i]<=p && i<high)
		i++;
		while(a[j]>p)
		j--;
		if(i<j) {
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	else {
		temp=a[low];
		a[low]=a[j];
		a[j]=temp;
		return j;
	}
	}
	return j;
	}
	void Quicksort(int a[],int low, int high) {
		if(low<high) {
			int k=partition(a,low,high);
			Quicksort(a,low,k-1);
			Quicksort(a,k+1,high);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++) {
			a[i]= sc.nextInt();
			}
		sc.close();
		
		System.out.println("Before Sorting:");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+ " ");
		System.out.println();
		
		D03QuickSortImplementation q = new D03QuickSortImplementation();
		q.Quicksort(a,0,n-1);
		
		System.out.println("After Sorting:");
		for(int i=0;i<n;i++)
		System.out.print(a[i]+ " ");
	}
}