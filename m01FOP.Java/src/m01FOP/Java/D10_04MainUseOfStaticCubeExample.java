package m01FOP.Java;

public class D10_04MainUseOfStaticCubeExample {
	
//	int cube(int x) {   							//This will throw an error as we need Static
	
	static int cube(int x) {
	return x*x*x;
	}
	public static void main(String[] args) {
		int result=D10_04MainUseOfStaticCubeExample.cube(10);
		System.out.println(result);
	}
}