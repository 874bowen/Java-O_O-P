public class Dog extends Canine implements Pet {
	public void setTag(String t){
		tag = t;
	}
	public void setOwned(boolean o){
		owned = o;
	}
	public String getTag(){
		return tag;
	}
	public boolean getOwned(){
		return owned;
	}
	public void makeNoise(){
		System.out.println("Dog Howls all the Way");
	}
	public void eat(){
		System.out.println("Dog eats meat");
	}
}