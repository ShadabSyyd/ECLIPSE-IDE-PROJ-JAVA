package w06StackAndQueue;

public class D01StackImplementation {
	static final int sizeOfStack=1000;
	int currentPointer;
	int a[]=new int[sizeOfStack];//Max Size of Stack
	D01StackImplementation(){
		currentPointer=-1;
	}
	boolean push(int x) {
		if(currentPointer>=sizeOfStack) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			a[++currentPointer]=x;
			System.out.println(" "+x+" pushed into Stack");
			return true;
		}
	}
	int pop() {
		if(currentPointer<0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x=a[currentPointer--];
			return x;
		}
	}
	void printStack() {
		for(int i=currentPointer;i>-1;i--) {
			System.out.print(" "+a[i]);
		}
	}
	public static void main(String[] args) {
		D01StackImplementation ob=new D01StackImplementation();
		ob.push(2);
		ob.push(4);
		ob.push(6);
		ob.push(5);
		ob.push(3);
		ob.push(9);
		System.out.println("\n"+ob.pop()+" is Popped from Stack now");
		System.out.println(ob.pop()+" is Popped from Stack now\n");
		System.out.println("Elements present in the stack:");
		ob.printStack();
	}
}
