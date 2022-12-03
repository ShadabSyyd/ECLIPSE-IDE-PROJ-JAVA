package m01FOPWeek1LiveClass;

import java.util.Random;

public class L05FindingMinimumNumberFromArray {
	public static void main(String[] args){
		Random newNo=new Random();
		
		int[] arr=new int[100];
		
		for(int a=0;a<arr.length;a++) {
			arr[a]=newNo.nextInt(100);
		}
		
		for(int a=0;a<arr.length;a++) {
			System.out.println(arr[a]);
		}
		
		int assignedInt=arr[0];
		int assignedInt2=arr[0];
		for(int a=0;a<arr.length;a++) {
			if (assignedInt>arr[a]) {
				assignedInt=arr[a];
			}
			if (assignedInt2<arr[a]) {
				assignedInt2=arr[a];
			}

		}
		System.out.println("Minimum Generated Random No is: "+assignedInt);
		System.out.println("Maximum Generated Random No is: "+assignedInt2);
		
	}
}
