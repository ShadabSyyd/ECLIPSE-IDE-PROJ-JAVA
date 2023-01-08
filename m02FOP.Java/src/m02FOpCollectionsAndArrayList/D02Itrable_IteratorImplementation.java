package m02FOpCollectionsAndArrayList;
import java.util.ArrayList;
import java.util.Iterator;

public class D02Itrable_IteratorImplementation {
	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		
		Iterator<Integer> itr=list1.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		
		
		//Method 2 using for each loop
		for(Integer obj: list1) {
			System.out.print(obj+" ");
		}
	}
}
