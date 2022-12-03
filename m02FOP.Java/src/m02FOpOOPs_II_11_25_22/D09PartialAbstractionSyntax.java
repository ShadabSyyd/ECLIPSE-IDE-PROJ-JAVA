package m02FOpOOPs_II_11_25_22;

abstract class ClassName11{
public int variable_name = 20;

// abstract method 
public abstract void methodName();

// Regular method 
public void regMethod(){

//code...

}
}


class ClassName21 extends ClassName11{ 
	public void methodName(){ //abstract method

//code... 
}
}

public class D09PartialAbstractionSyntax{
	public static void main(String[] args){ 
		ClassName21 obj = new ClassName21();
		obj.methodName(); 
		obj.regMethod();
}
}
