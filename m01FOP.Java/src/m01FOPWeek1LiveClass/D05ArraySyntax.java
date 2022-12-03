package m01FOPWeek1LiveClass;
import java.util.Scanner;
class arrayDemo{
	String[] name=new String[10];
	int[] roomNo=new int[10];
	int[] amount=new int[10];
	long[] cellNo=new long[10];
}
public class D05ArraySyntax {
	public static void main(String[] Args) {
		
		Scanner inp=new Scanner(System.in);
		
		arrayDemo payee=new arrayDemo();
		
		for(int a=0; a<10;a++) {
			System.out.println("Enter the Name of Roomie ");
			payee.name[a]=inp.nextLine();
			System.out.println("Enter the Room No of Roomie ");
			payee.roomNo[a]=inp.nextInt();
			
			System.out.println("Enter the Monthly Amount No of Roomie ");
			payee.amount[a]=inp.nextInt();
			
			System.out.println("Enter the Phone No of Roomie "+payee.name);
			payee.cellNo[a]=inp.nextLong();
		}
		inp.close();
		
		for(int a=0; a<10;a++) {
			System.out.printf("Name of Roomie %s\nRoom No: %d\nMonthly Amount %d\nCell Phone: %d",payee.name[a],payee.roomNo[a],payee.amount[a],payee.cellNo[a]);
		}
		
	}
}
