package m01FOPWeek1LiveClass;

public class L09SummationOf2DArrayMatrix {
	public static void main(String[] args) {
		int[][] arrOne= {{21,22,32,33},{32,65,78,79},{12,32,42,12}};
		int[][] arrTwo= {{54,67,42,13},{23,12,34,65},{33,43,11,72}};
		
		int[][] arrThree=new int[arrOne.length][arrOne[0].length]; //Since 2 rows are of same sizes so no need to declare size of columns multiple times
		
		for (int a=0;a<arrOne.length;a++) {
			for(int b=0;b<arrOne[a].length;b++) {
				arrThree[a][b]=arrOne[a][b]+arrTwo[a][b];
			}
		}
		for (int a=0;a<arrOne.length;a++) {
			for(int b=0;b<arrOne[a].length;b++) {
				System.out.print("|"+arrThree[a][b]+"|");
			}
		System.out.println();
		}
	}
}
