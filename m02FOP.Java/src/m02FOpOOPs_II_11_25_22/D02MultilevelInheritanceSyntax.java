package m02FOpOOPs_II_11_25_22;

class Class1{
	public void method1(){
		System.out.println(" Base Class Method");
	}
}

class Class2 extends Class1{
	public void method2(){ 
		System.out.println(" inside Class2, method2");
	}
}

class Class3 extends Class2{
	public void method2(){ 				//Same Name as method in Class2
		System.out.println(" inside Class3, method2");
	}
}


class D02MultilevelInheritanceSyntax{
	public static void main(String[] args){
	Class3 c = new Class3();
	c.method1(); 					//from class1
	c.method2(); 					// overriding class2 and printing class3
	}
}
		
	/*
	Output:
	Base Class Method 
	Inside Class3, method 2
	*/

