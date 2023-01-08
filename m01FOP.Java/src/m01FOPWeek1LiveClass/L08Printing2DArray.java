package m01FOPWeek1LiveClass;

public class L08Printing2DArray {
	public static void main(String[] args) {
		int[][] arrDemo= {{22,32,43,16,66},{35,84,12},{22},{22,68,82,11},{/*BLank Column*/},{22,13,43,61,65,47}};
		
		//We cannot Resize the array
//		arrDemo[4][0]=2555;//We cannot allocate vLUE LIKE THIS because its not a dynamic array and we cant resize like this
//		arrDemo[0][5]=2555;//We cannot allocate vLUE LIKE THIS
		
		//Reallocating Values
		arrDemo[0][4]=55;//We CAN allocate pre defined size we changed 66 to 55
		
		for(int a=0;a<arrDemo.length;a++) {
			for(int b=0;b<arrDemo[a].length;b++) {
				System.out.print(" | "+arrDemo[a][b]+" | ");
		}
		System.out.println();
		}
	}
}
