package m01FOPWeek1LiveClass;

public class L08ArrayLength2DArrays {
	public static void main(String[] args) {
		int[][] arrayDem= {{22,333,44,3323},{33,3344,554,665,45,5667,4543,45354},{45,435,65,345,653},{55,554,5893,499,6656,464,666}};
		int a =arrayDem.length;
		System.out.println("Length of array rows: "+a);
		System.out.println("Length of array rows(Direct Method): "+arrayDem.length);
		
		
		for(int b=0;b<arrayDem.length;b++) {
			System.out.println("Length of Column "+(b+1)+": "+arrayDem[b].length);
		
		}
	}
}