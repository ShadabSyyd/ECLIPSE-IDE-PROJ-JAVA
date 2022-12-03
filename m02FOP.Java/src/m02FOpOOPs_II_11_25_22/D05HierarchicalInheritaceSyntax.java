package m02FOpOOPs_II_11_25_22;

//public class D05HierarchicalInheritaceSyntax {
//
//}


class Classinher1{
	public void method1(){
	System.out.println(" Base Class Method ");
	}
}

class Classinher2 extends Classinher1{
	public void method2(){
	System.out.println(" inside Class2, method2"); 
	}
}
	
	
	
class Classinher3 extends Classinher1{
	public void method2(){
	
	System.out.println(" inside Class3, method2");
	}
}


class D05HierarchicalInheritaceSyntax{ 
	public static void main(String[] args){
	
	Classinher2 c1 = new Classinher2();
	c1.method1(); //from class1
	c1.method2(); //from class2
	
	Classinher3 c2 = new Classinher3(); 
	c2.method1(); //from class1 
	c2.method2(); //from class3
	}
}