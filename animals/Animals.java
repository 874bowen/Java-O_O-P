public abstract class Animals {
	private int picture;
	private String food;
	private boolean hunger;
	private String locations;
	private boolean boundaries;

	public void setPicture(int p){ picture = p; }
	public void setFood(String f){ food = f; }
	public void setHunger(boolean h){ hunger = h; }
	public void setLocations(String l){ locations = l; }
	public void setBoundaries(boolean b){ boundaries = b; }

	public int getPicture(){ return picture; }
	public String getFood(){ return food; }
	public boolean getHunger(){ return hunger; }
	public String getLocations(){ return locations; }
	public boolean getBoundaries(){ return boundaries; }

	public abstract void makeNoise();
	public abstract void eat();
	public void sleep(){ System.out.println("I do sleep"); }
	public abstract void roam();

}