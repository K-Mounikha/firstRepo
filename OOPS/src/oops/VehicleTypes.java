/*21. Create a class hierarchy for different types of vehicles using inheritance, with
each subclass implementing its own unique features such as fuel type and number of wheels.
*/
package oops;
abstract class Vehicle {
  private String brand;
  private String model;
  private int year;

  public Vehicle(String brand, String model, int year) {
      this.brand = brand;
      this.model = model;
      this.year = year;
  }

  public String getBrand() {
      return brand;
  }

  public void setBrand(String brand) {
      this.brand = brand;
  }

  public String getModel() {
      return model;
  }

  public void setModel(String model) {
      this.model = model;
  }

  public int getYear() {
      return year;
  }

  public void setYear(int year) {
      this.year = year;
  }

  public abstract String getFuelType();
  public abstract int getNumberOfWheels();

  public void displayInfo() {
      System.out.println("Brand: " + brand);
      System.out.println("Model: " + model);
      System.out.println("Year: " + year);
      System.out.println("Fuel Type: " + getFuelType());
      System.out.println("Number of Wheels: " + getNumberOfWheels());
  }
}
class Car extends Vehicle {
  private String fuelType;
  private int numberOfWheels;

  public Car(String brand, String model, int year, String fuelType) {
      super(brand, model, year);
      this.fuelType = fuelType;
      this.numberOfWheels = 4;
  }
  public String getFuelType() {
      return fuelType;
  }
  public int getNumberOfWheels() {
      return numberOfWheels;
  }
}
class Bike extends Vehicle {
  private String fuelType;
  private int numberOfWheels;

  public Bike(String brand, String model, int year, String fuelType) {
      super(brand, model, year);
      this.fuelType = fuelType;
      this.numberOfWheels = 2;
  }
  public String getFuelType() {
      return fuelType;
  }
  public int getNumberOfWheels() {
      return numberOfWheels;
  }
}

public class VehicleTypes {

	public static void main(String[] args) {
		 Vehicle myCar = new Car("Toyota", "Camry", 2020, "Petrol");
	        Vehicle myBike = new Bike("Yamaha", "MT-07", 2021, "Petrol");

	        System.out.println("Car Info:");
	        myCar.displayInfo();
	        System.out.println("\nBike Info:");
	        myBike.displayInfo();
	}

}
