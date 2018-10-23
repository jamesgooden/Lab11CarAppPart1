
import java.util.Scanner;





public class CarApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int amountOfCars;
		String carMake;
		String carModel;
		 int carYear;
		double carPrice;
		String userContinue;
		
System.out.println("Welcome to the Grand Circus Motors admin console!");

do {
System.out.println("How many cars are you entering?: ");
amountOfCars = ValidationMethods.getInt(scan ," "  , 0);
int carNum = 1;
Car[] carAmount = new  Car [amountOfCars];


int i ;
for ( i = 0; i < carAmount.length; i++) {
	System.out.println("Enter car " + "#" + carNum+   " Make:");
	carMake  = ValidationMethods.getStringMatchingRegex(scan, " " , "^[A-z]+${30}");
    System.out.println("Enter car "+ "#" + carNum + " Model"  );
    carModel = ValidationMethods.getStringMatchingRegex(scan, " ","^[A-z]+${30}");
   System.out.println("Enter car " + "#" +carNum + " Year" );
   carYear = ValidationMethods.getInt(scan, " ");
   System.out.println("Enter car " +"#" + carNum + " Price" );
   carPrice = ValidationMethods.getDouble(scan, "$ ");
   carNum = carNum + 1;
   
carAmount[i] = new Car ( carMake, carModel , carYear , carPrice);


	}
System.out.println("Current inventory:");
for (int j = 0; j < carAmount.length; j++) {
	System.out.println( carAmount[j]);
}
  userContinue = ValidationMethods.getString(scan , "Would you like to continue? ");
} while (userContinue.equalsIgnoreCase("Y"));

scan.close();

	

}
	
}