package m02FOpOOPs_II_11_25_22;


class Bike26{

int speedlimit=80;

void run() {System.out.println("In Super Class"); }
}

public class D26PolymorphismImplementationMethodOverride extends Bike26{

int speedlimit=160; 
void run(){System.out.println("In Sub Class");}

public static void main(String args[]){
Bike26 obj=new D26PolymorphismImplementationMethodOverride();

System.out.println(obj);
System.out.println(obj.speedlimit);
obj.run();
}
}