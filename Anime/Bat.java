public class Bat extends Animal implements Bird, Mammal{
	public void giveBirth(){
		System.out.println("I am a Mammal and I give birth");
	}
	public void fly(){
		System.out.println("I am a Bird and I fly");
	}
	public void eat(){
		System.out.println("I am a Animal and I eat");		
	}
	public void exercise(){
		System.out.println("I am a Animal and I exercise");
	}
	public void sleep(){
		System.out.println("I am a Animal and I sleep");
	}
}