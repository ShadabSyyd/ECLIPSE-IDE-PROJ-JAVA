package m01FOPWeek1LiveClass;

public class L08Printing2DArray {
	public static void main(String[] args) {
		int[][] arrDemo= {{22,32,43,16,66},{35,84,12},{22},{22,68,82,11},{22,13,43,61,65,47}};
		for(int a=0;a<arrDemo.length;a++) {
			for(int b=0;b<arrDemo[a].length;b++) {
				System.out.print(" | "+arrDemo[a][b]+" | ");
		}
		System.out.println();
		}
	}
}
