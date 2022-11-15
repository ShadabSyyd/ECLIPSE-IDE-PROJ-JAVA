package temp;

class Animal{
	static String planet;
	String name;
	String color;
	Boolean canFly;

}

class C01ProjImp{
	public static void main(String[] args) {
		Animal cat=new Animal();
		Animal bird=new Animal();
		
		cat.name="Pill";
		cat.color="Brown";
		bird.name="Bill";
		bird.color="White";
		System.out.println(cat.name+"\n"+bird.name);
		System.out.println(cat.color+"\n"+bird.color);
		
		
		//If we change Static anywhere then it will be reflected everywhere
		
		bird.planet="Earth";
		System.out.println(cat.planet+"\n"+bird.planet);
		
		cat.planet="Neptune";
		System.out.println(cat.planet+"\n"+bird.planet);
		
		//Correct Way
		
		Animal.planet="Mars";
		System.out.println(cat.planet+"\n"+bird.planet);




	}
}