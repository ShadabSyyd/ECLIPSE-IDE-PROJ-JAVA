package week4.Basic;
class Animal1{
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
		Animal1 cat= new Animal1();
		Animal1 bird= new Animal1();
		cat.setName("Pill");
		System.out.println(cat.getName());
		cat.updateCount();

		bird.setName("Billy");
		System.out.println(bird.getName());
		bird.updateCount();
	}
}
