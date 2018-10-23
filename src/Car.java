
public class Car {

private String makeOfCar;
private String carModel;
private int carYear;
private double carPrice;

public Car()  {
	
	
}

public Car(String makeOfCar, String carModel, int carYear, double carPrice) {
	super();
	this.makeOfCar = makeOfCar;
	this.carModel = carModel;
	this.carYear = carYear;
	this.carPrice = carPrice;
}




public String getMakeOfCar() {
	return makeOfCar;
}
public void setMakeOfCar(String makeOfCar) {
	this.makeOfCar = makeOfCar;
}
public String getCarModel() {
	return carModel;
}
public void setCarModel(String carModel) {
	this.carModel = carModel;
}
public int getCarYear() {
	return carYear;
}
public void setCarYear(int carYear) {
	this.carYear = carYear;
}
public double getCarPrice() {
	return carPrice;
}
public void setCarPrice(double carPrice) {
	this.carPrice = carPrice;
}

@Override
public String toString() {
	return String.format("%-15s%-15s%-20s%-20s", makeOfCar ,carModel, carYear, "$"+carPrice);
}
		
}



