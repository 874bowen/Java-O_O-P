public class TestMammals {

	public static void main(String[] args) {
	  Cow freshian = new Cow(); 

	  freshian.setHeartRate(72); 
	  freshian.setRespirationRate(100); 
	  freshian.setBloodGroup("A");

	  System.out.println("Heart Rate " + freshian.getHeartRate());
	  System.out.println("Heart Rate " + freshian.getRespirationRate());
	  System.out.println("Heart Rate " + freshian.getBloodGroup());
	}
}