package m02FOpOOPs_II_11_25_22;

class InheritanceA{
	public float circleArea(float rad) {
		float area=3.14f*rad*rad;
		return area;
	}
}

class InheritanceB extends InheritanceA{
	public float rectangleArea(float length, float breadth) {
		float area=length*breadth;
		return area;
	}
}

class InheritanceC extends InheritanceB{
	public float triangleArea(float base, float height) {
		float area=0.5f*base*height;
		return area;
	}
}


public class C10InheritanceToFindArea {
	public static void main(String[] args) {
		InheritanceC ob1=new InheritanceC();
		InheritanceC ob2=new InheritanceC();
		InheritanceC ob3=new InheritanceC();
		
		float method1circle=ob1.circleArea(2.56f);
		float method2rectangle=ob2.rectangleArea(10,5);
		float method3triangle=ob3.triangleArea(10,20);
		
		System.out.println("Area of Circle: "+method1circle+"\nArea of rectangle: "
		+method2rectangle+"\nArea of Triangle: "+method3triangle);
		
	}
	
}

/*
Write an algorithm to create classes InheritanceA, InheritanceB and InheritanceC to find the 
Area of circleArea 
RectangleArea 
TriangleArea 
 
Use multi level inheritance and execute all methods using the object of class InheritanceC.

Note: 
create methods circleArea, rectangleArea and triangleArea in 
the classes InheritanceA, InheritanceB and InheritanceC respectively.
*/