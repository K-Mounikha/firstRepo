//10. Create a class representing a car, with private variables for make and model and public methods for starting and stopping the engine.
package Encapsulation;

public class Car {
    private String make;
    private String model;
    private boolean engineRunning;
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        this.engineRunning = false; // Initialize engine state as stopped
    }
    // Public method to start the engine
    public void startEngine() {
        if (!engineRunning) {
            System.out.println("Starting the engine of " + make + " " + model);
            engineRunning = true;
        } else {
            System.out.println("Engine is already running.");
        }
    }
    // Public method to stop the engine
    public void stopEngine() {
        if (engineRunning) {
            System.out.println("Stopping the engine of " + make + " " + model);
            engineRunning = false;
        } else {
            System.out.println("Engine is already stopped.");
        }
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public static void main(String[] args) {
        Car myCar = new Car("Toyota","Camry");
        myCar.startEngine();
        myCar.startEngine();
        myCar.stopEngine();
        myCar.stopEngine();
    }
}
