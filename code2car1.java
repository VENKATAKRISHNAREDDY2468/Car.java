package newProject;

public class code2car1 
   {
       
	  int maxSpeed = 100;
	  int minSpeed = 0;
	  
	  double weight = 4079;
	  
	  boolean isTheCarOn = false;
	  char condition = 'A';
	  String nameOfCar = "Lucy";
	  
	  
	  double maxFuel = 16;
	  double currentFuel = 8;
	  double mpg = 26.4;
	  
	  int numberOfPeopleInTheCar = 1;
	   
	  
	  // f(x,y,z) = x + 1/z-y;
	  // Say x = 5;
	  // f(x) = 5 + 1 = 6;
	  
	  
	  public code2car1(int customMaxSpeed, double customWeight, boolean customIsTheCarOn) 
	  {
		  maxSpeed = customMaxSpeed; 
		  weight = customWeight;
		  isTheCarOn = customIsTheCarOn;
	  }
	  
	  public void printVariables() {
		  System.out.println("This is the maxSpeed " + maxSpeed);	
		  System.out.println(minSpeed);
		  System.out.println(weight);
		  System.out.println(isTheCarOn);
		  System.out.println(condition);
		  System.out.println(nameOfCar);
		  System.out.println(numberOfPeopleInTheCar);
	  }   
	  
	  public void upgradeMinSpeed() {
		  minSpeed = maxSpeed;
		  maxSpeed = maxSpeed + 1;
	  }
	  
	  public void getIn() {
		  
		// numberOfPeopleInTheCar = numberOfPeopleInTheCar + 1;
		  numberOfPeopleInTheCar++;
	  }
	  
	  public void getOut() {
		  
		 // numberOfPeopleInTheCar = numberOfPeopleInTheCar - 1;
		  numberOfPeopleInTheCar--;
	  }
	  
	  
	  public double howManyMilesTillOutOfGas() {
		  
		  return currentFuel * mpg;
	  }
	  
	  public double maxMilesPerFillUp() {
		  
		  return maxFuel * mpg;
	  }
	  
	  
	  
	  
	  
	  public static void main(String args[]) 
	   {
		 
		  code2car1 birthdayPresent = new code2car1(500, 5000.5325, true);
		  System.out.println("Birthday Car v1");
		  birthdayPresent.printVariables();
		  birthdayPresent.getIn();
		  birthdayPresent.getIn();
		  birthdayPresent.getIn();
		  System.out.println("Miles Left:" + birthdayPresent.howManyMilesTillOutOfGas());
		  System.out.println("Max Miles:" + birthdayPresent.maxMilesPerFillUp());
		  System.out.println("Birthday Car v2");
		  birthdayPresent.printVariables();
		  birthdayPresent.getOut();
		  System.out.println("Birthday car v3");
		  birthdayPresent.printVariables();
		    
		  //  System.out.println("Christmas Car");
		 // code2car1 christmaspresent = new code2car1(550, 2000, false); 
		//  christmaspresent.printVariables();   	  
	  }	  
	  
}
