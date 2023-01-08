package m02FOpCollectionsAndArrayList;
import java.util.ArrayList;  //For List1
import java.util.List;       //For List2
public class D01ArrayListImplementation {
	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<>();
		
		//Array list is an implementation of list	above we given concrete implementation
		
		//But its a good practice to always code for interface ie array list is an implementaion of list itself
		//So we can write it like below
		
		List<Integer> list2 =new ArrayList<>();
		System.out.println("List1: "+list1+"\nList 2: "+list2);
		
		//Appending Element
		list1.add(1);
		list1.add(2);
		System.out.println("List1: "+list1);
		
//		list1.add(index: 0,element:3);//Some error only works with IntelliJ
		
		//Appending Element at 0th index
		list1.add(0,3);
		
		//Appending List element in List2
		list2.add(4);
		list2.add(5);
		list2.addAll(list1);
		
		System.out.println("List2: "+list2);
		 
		list2.set(2, 101);
		System.out.println("List2: "+list2);
		
		list2.remove(0);
		System.out.println("List2: "+list2);
		System.out.println("Element at 3rd index at list2 "+list2.get(2));		
	}
}
