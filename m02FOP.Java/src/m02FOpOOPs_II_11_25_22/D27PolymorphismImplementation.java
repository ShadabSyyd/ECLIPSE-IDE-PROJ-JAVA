package m02FOpOOPs_II_11_25_22;


class Animal27{
void eat(){
System.out.println("animal is eating..");
}
}
class Dog27 extends Animal27{

void eat(){
System.out.println("dog is eating...");
}
}

public class D27PolymorphismImplementation extends Dog27{
public static void main(String[] args){
Animal27 a=new D27PolymorphismImplementation();

System.out.println(a);

a.eat();
}
}