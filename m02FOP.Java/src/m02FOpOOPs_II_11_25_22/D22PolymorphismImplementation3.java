package m02FOpOOPs_II_11_25_22;

class X{
public void methodA()//base class
{
System.out.println("hello, I am method A of Class X");
}
}
class Y extends X{
public void methodA()//Derived class method
{
System.out.println("hello, I am method A of Class Y");
}
}

public class D22PolymorphismImplementation3 {
public static void main(String args[]){
X obj1 = new X();   //Reference and object X
X obj2 = new Y();  //X reference but Y object
obj1.methodA();
obj2.methodA();
}
}