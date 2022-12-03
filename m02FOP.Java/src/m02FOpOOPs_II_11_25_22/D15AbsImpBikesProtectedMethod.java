package m02FOpOOPs_II_11_25_22;

class BikeProt{
protected int speedlimit=75;
//private int speedlimit=76; //Error because its private so we cannot access in class D15AbsImpBikesProtectedMethod
} 

public class D15AbsImpBikesProtectedMethod  extends BikeProt{ 
int speedlimit=150;
public static void main(String args[]){ 
	
BikeProt obj=new D15AbsImpBikesProtectedMethod (); 
System.out.println(obj.speedlimit);                         //75
}
}