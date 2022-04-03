class Cow extends Mammal {
  
  int chewCycles; 
  
  Cow () { 
    System.out.println(" ... and also a Cow! ");
  }

  private String eat_method (String foodType, String chewType, int chewTime, int chewCycles) { 
    String response = "I eat "+ foodType + " by " + chewType + "for "+ chewTime + " in " + chewCycles;
    return response; 
  }

}