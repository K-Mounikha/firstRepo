/*
 5.Single inheritance with Fields
  a.The vehicle class has a field ‘type’ and the car class inherits from it. 
  However, car class also has its own field name ‘type’ which hides the field form the base class.
   In this case, when calling displayType () from an instance of Car it accesses the field from the base class 
   while displayCarType () accesses the field from the derived class.
 */
package single_inheritance;
class Vehicle{
	public String type;
	public Vehicle(String type)
	{
		this.type=type;
	}
	 public void displayType() {
	        System.out.println("Vehicle type: " + type);
	    }
}
class Car extends Vehicle{
	public String type;
	public Car(String vehicleType, String carType) {
        super(vehicleType); // Initialize the base class field
        this.type = carType; // Initialize the derived class field
    }
    public void displayCarType() {
        System.out.println("Car type: " + type);
    }
}
public class Fields {

	public static void main(String[] args) {
	Car c=new Car("car","BMW");
	c.displayType();
	c.displayCarType();
	

	}

}
