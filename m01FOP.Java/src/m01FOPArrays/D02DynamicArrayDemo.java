package m01FOPArrays;

public class D02DynamicArrayDemo {
	int[] arr;
	int size;
	int capacity;
		
	D02DynamicArrayDemo(int vop) {
		arr= new int [vop];
		capacity=vop;
		size=0;
	}
	
	void insert(int element) {
		if (size==capacity) {
			growArray();
		}
		arr[size++]=element;
	}
	
	void growArray() {
		int[] tmpArr=new int[2*size];
		for(int i=0;i<size;i++) {
			tmpArr[i]=arr[i];
		}
		arr=tmpArr;
		capacity=2*size;
	}
	
	int delete(int index) {
		if (index>=size) {
			return -1;
		}
		System.out.printf("Size is %d\n",size);
		int deletedElement=arr[index];
		for(int i=index+1;i<size;i++) {
			arr[i-1]=arr[i];
		}
		size--;
		System.out.printf("Size is %d\n",size);
		return deletedElement;
	}
	void display() {
		System.out.println("\nArray with Size");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		D02DynamicArrayDemo obj1= new D02DynamicArrayDemo(3);
		obj1.insert(12);
		obj1.insert(13);
		obj1.insert(15);
		obj1.insert(18);
		obj1.display();
		System.out.println("Delete Element: "+obj1.delete(2));
		obj1.display();
	}
}

