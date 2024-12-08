//17.Implement an abstract class for different types of vehicles, with subclasses for different modes of transportation like car and bike.
package abstraction;
abstract class Transport {
    private String brand;
    private String model;

        Transport(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
    public abstract void move();
}
class Cars extends Transport {
    public Cars(String brand, String model) {
        super(brand, model);
    }
    public void move() {
        System.out.println("The car " + getBrand() + " " + getModel() + " is driving on the road.");
    }
}
class Bikes extends Transport {
    public Bikes(String brand, String model) {
        super(brand, model);
    }
    public void move() {
        System.out.println("The bike " + getBrand() + " " + getModel() + " is riding on the road.");
    }
}

public class VehicleRunning {

	public static void main(String[] args) {
		Transport car = new Cars("Toyota", "Corolla");
        Transport bike = new Bikes("Yamaha", "MT-07");

        car.move();
        bike.move();

	}

}
