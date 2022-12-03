package temp;
 class ANImals{
	static int count;
	String name;
	
	void setName(String nam){
		this.name=nam;
	}
	
	String getName() {
		return name; 	
	}
	
	 void updateCount() {  //We Can use--> 
		//										void updateCount(){
		count++;
		System.out.println(count);
	}
}

class Temp1{
	public static void main (String[] args) {
		ANImals cat= new ANImals();
		ANImals bird= new ANImals();
		cat.setName("Pill");
		System.out.println(cat.getName());
		cat.updateCount();

		bird.setName("Billy");
		System.out.println(bird.getName());
		bird.updateCount();
	}
}