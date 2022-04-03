class Mammal {

  private int heartRate; 
  private int respirationRate; 
  private String bloodGroup; 

  static int eyes = 2;
  String foodType; 
  int chewTime; 

  Mammal () { 
    System.out.println("I am an Animal");
  }

  public void setHeartRate (int heartRate) { 
    this.heartRate = heartRate; 
  }

  public void setRespirationRate (int respirationRate) { 
    this.respirationRate = respirationRate; 
  }

  public void setBloodGroup (String bloodGroup) { 
    this.bloodGroup = bloodGroup; 
  }

  public int getHeartRate() {
    return heartRate;
  }

  public int getRespirationRate() {
    return respirationRate;
  }
  
  public String getBloodGroup() {
    return bloodGroup;
  } 

  public void eat_method (String foodType, String chewType, int chewTime) { 
    System.out.println("I eat "+ foodType+ " by " + chewType + "for "+ chewTime +" minutes");
  }

}