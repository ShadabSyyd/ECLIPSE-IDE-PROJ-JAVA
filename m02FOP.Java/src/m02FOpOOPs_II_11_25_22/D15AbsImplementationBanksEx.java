package m02FOpOOPs_II_11_25_22;

abstract class Bank{ 
abstract int getRateOfInterest(); 
}

class SBI extends Bank{
int getRateOfInterest() {return 11;}
}
class PNB extends Bank{
int getRateOfInterest() {return 12;}
}

public class D15AbsImplementationBanksEx{
public static void main(String args[]){ 
Bank b=new SBI();     //if object is PNB, method of PNB will executed

int interest=b.getRateOfInterest(); 
System.out.println("Rate of Interest is:"+interest+"%");
}
}