package m01FOPArrays;

public class D01ArrayDemo {
	public static void main(String[] args) {
		int[] arr= new int[5]; //Via new keyword
		arr[0]=201;
		arr[1]=202;
		arr[2]=203;
		arr[3]=204;
		arr[4]=205;
		
		int[] arr2= {501,502,503,504,505};   //Initialization at time of declaration auto by compiler
		for(int a=0;a<5;a++) {
		System.out.println("Val"+a+" "+arr[a]+" Val"+a+" "+arr2[a]);
		}	
	}
}
