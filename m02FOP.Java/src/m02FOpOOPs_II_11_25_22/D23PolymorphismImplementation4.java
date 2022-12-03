package m02FOpOOPs_II_11_25_22;

class Animal5{

public void move() { 
System.out.println("Animals can move");
}
}

class Dog extends Animal5{
public void move(){
 System.out.println("Dogs can walk and run");
}
}

public class D23PolymorphismImplementation4{
public static void main(String args[]){ 
Animal5 a = new Animal5(); // Animal reference and animal object
Animal5 b = new Dog(); // Animal reference but Dog object

a.move();
b.move();
}
}