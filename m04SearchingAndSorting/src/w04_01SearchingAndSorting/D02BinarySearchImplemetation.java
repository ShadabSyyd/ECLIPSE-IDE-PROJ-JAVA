package w04_01SearchingAndSorting;

public class D02BinarySearchImplemetation {

}

class BinarySearch {
	public static void binarySearch (int arr[], int first, int last, int key) {
	
		int mid = (first + last) / 2;
		
		while (first <= last) { 
			if (arr[mid] < key) { 
				first=mid + 1;
			}
		
			else if (arr[mid] == key) {
			
			System.out.println("Element found at array index: " + mid); 
			break;
			}
			else {		
				last = mid-1;
			}
			mid=(first+last)/2;
		}
		if (first > last) { 
			System.out.println("Element is not found!");
		}
	}

		public static void main(String args[]) { 
			int arr[]= {4, 10, 18, 43, 56 }; 
			int key= 43;
			int last=arr.length-1;
			binarySearch(arr,0,last,key);
			
		}
	}