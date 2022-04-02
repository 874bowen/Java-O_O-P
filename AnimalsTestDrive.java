public class AnimalsTestDrive{
	public static void main(String[] args){
		System.out.println("Animals all the way!!!");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("==============================================================");

		Animals hippo = new Hippo();
		hippo.setPicture(10);
		Dog aDog = new Dog();
		aDog.setTag("Foxy");
		aDog.setOwned(true);
		System.out.println("I am dog " + aDog.getTag() + "and I am Owned " + aDog.getOwned());
		System.out.println(hippo.getPicture());
		System.out.println("==============================================================");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

}