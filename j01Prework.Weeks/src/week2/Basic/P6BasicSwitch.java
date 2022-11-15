package week2.Basic;

public class P6BasicSwitch {
	public static void main(String[] args){
		int num=4;
		
		switch(num) {
		case 1: System.out.println("Neither Prime nor Composite");
		break;
		case 4: System.out.println("Number is Composite");break;
		case 2: System.out.println("Number is Prime");break;
		default: System.out.println("Enter the number again");
		}
	}
}
