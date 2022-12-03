package m02FOpOOPs_II_11_25_22;



class Animal24{

public void move(){

System.out.println("Animals can move");

}
//public void bark(){ 
//System.out.println("Temo");
//}
}

class Dog24 extends Animal24{
public void move(){ 
System.out.println("Dogs can walk and run");
}
public void bark(){ 
System.out.println("Dogs can bark");
}
}



public class D24PolymorphismImplementation5{
public static void main(String args[]){ 
Animal24 a = new Animal24(); // Animal ref and obj
Animal24 b = new Dog24(); // Animal ref and dog obj
Dog24 c = new Dog24();

a.move();
b.move();

// important 

//b.bark();// we need an another copy of bark in Anial24 even to run the method of dog4
c.bark();
}
}

