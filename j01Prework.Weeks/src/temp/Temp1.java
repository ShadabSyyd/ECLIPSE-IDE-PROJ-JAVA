package temp;
class Animal{
	static int count;
	String name;
	
	void setName(String nam){
		this.name=nam;
	}
	
	String getName() {
		return name; 	
	}
	
	static void updateCount() {  //We Can use--> 
		//										void updateCount(){
		count++;
		System.out.println(count);
	}
}

class C04MethodImplementation{
	public static void main (String[] args) {
		Animal cat= new Animal();
		Animal bird= new Animal();
		cat.setName("Pill");
		System.out.println(cat.getName());
		cat.updateCount();

		bird.setName("Billy");
		System.out.println(bird.getName());
		bird.updateCount();
	}
}