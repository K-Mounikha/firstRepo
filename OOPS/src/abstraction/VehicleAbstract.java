//4.Create an abstract class for different types of vehicles, with each subclass implementing its own unique features.
package abstraction;
abstract class Vehicle {
    private String make;
    private String model;
    private int year;
    public Vehicle(String make,String model,int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public abstract void displayUniqueFeatures();
    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}
class Car extends Vehicle {
    private int numberOfDoors;
    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }
    public void displayUniqueFeatures() {
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}
class Truck extends Vehicle {
    private double loadCapacity;
    public Truck(String make, String model, int year, double loadCapacity) {
        super(make, model, year);
        this.loadCapacity = loadCapacity;
    }
    public void displayUniqueFeatures() {
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}
public class VehicleAbstract {

	public static void main(String[] args) {
		Vehicle car = new Car("Toyota", "Camry", 2022, 4);
        Vehicle truck = new Truck("Ford", "F-150", 2023, 1.5);

        System.out.println("Car Details:");
        car.displayInfo();
        car.displayUniqueFeatures();

        System.out.println("\nTruck Details:");
        truck.displayInfo();
        truck.displayUniqueFeatures();

	}

}
