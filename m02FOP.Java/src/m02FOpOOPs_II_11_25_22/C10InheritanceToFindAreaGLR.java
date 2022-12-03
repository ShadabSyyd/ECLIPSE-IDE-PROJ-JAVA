package m02FOpOOPs_II_11_25_22;
//public class C10InheritanceToFindAreaGLR {
//
//}

class InheritanceA1 {
	final float pi = 22 / 7;
 	public float radius, result;
	public void circleArea(float rad) {
		radius = rad;
		result = pi * radius * radius;
		System.out.println("The area of the circle is: "+ result + " cm");
	}
}

class InheritanceB1 extends InheritanceA1 {
	public float length, breadth, result;
	public void rectangleArea(int l, int b) {
		length = l;
		breadth = b;
		result = length * breadth;
		 System.out.println("The area of the rectangle is: " + result + " cmsquare");
	}
}


public class C10InheritanceToFindAreaGLR extends InheritanceB1 {
	public float base, height, result;
	public void triangleArea(int b, int h) {
		base = b; 
		height = h;
		result = 0.5f * base * height;
		System.out.println("The area of the triangle is:" + result + " cm square");
}
public static void main(String[] args) {
	C10InheritanceToFindAreaGLR inheritancec = new C10InheritanceToFindAreaGLR();
	inheritancec.circleArea(22.5f);
	inheritancec.rectangleArea(5, 6);
	inheritancec.triangleArea(3, 4);
}
}

