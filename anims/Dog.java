class Dog extends Mammal implements Pet{

  Dog () { 
    System.out.println(" ... and also a Dog! ");
  }

  protected string eat_method (String foodType, String chewType, int chewTime) { 
    String response = "I swallow "+ foodType+ " without chewing!";
    return response; 
  }
}