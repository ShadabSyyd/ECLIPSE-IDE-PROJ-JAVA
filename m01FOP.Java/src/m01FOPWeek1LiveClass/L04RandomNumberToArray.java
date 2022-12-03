package m01FOPWeek1LiveClass;
import java.util.Random;
public class L04RandomNumberToArray {
	public static void main(String[] args){
		Random newNo=new Random();
		
		int[] arr=new int[100];
		
		for(int a=0;a<arr.length;a++) {
			arr[a]=newNo.nextInt(100);
		}
		
		for(int a=0;a<arr.length;a++) {
			System.out.println(arr[a]);
		}
	}
}