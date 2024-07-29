//12. Create a class hierarchy for different types of food using inheritance, with subclasses for meat, vegetables, and fruit.
package inheritance;
class Food {
    private String name;
    private int calories;
    public Food(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public int getCalories() {
        return calories;
    }
    public void setCalories(int calories) {
        this.calories = calories;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Calories: " + calories);
    }
}
class Meat extends Food {
    private boolean chicken;

    public Meat(String name,int calories, boolean chicken) {
        super(name, calories);
        this.chicken=chicken;
    }

    public boolean isChicken() {
        return chicken;
    }

    public void setChicken(boolean chicken) {
        this.chicken=chicken;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Meat");
        System.out.println("Chicken: " +chicken);
    }
}
 class Vegetables extends Food {
    private String color;

    public Vegetables(String name, int calories, String color) {
        super(name, calories);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color=color;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Vegetables");
        System.out.println("Color: " + color);
    }
}
class Fruit extends Food {
    private String vitamin;
    public Fruit(String name,int calories,String vitamin) {
        super(name,calories);
        this.vitamin=vitamin;
    }

    public String getVitamin() {
        return vitamin;
    }

    public void setVitamin(String vitamin) {
        this.vitamin = vitamin;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Fruit");
        System.out.println("Vitamin: " +vitamin);
    }
}

public class FoodHierarchy {

	public static void main(String[] args) {
		Meat steak = new Meat("Chicken", 350, true);
        Vegetables spinach = new Vegetables("Brinjal", 50, "Green");
        Fruit apple = new Fruit("Apple", 100, "Vitamin C");
        System.out.println("--- Meat ---");
        steak.displayInfo();
        System.out.println();
        System.out.println("--- Vegetables ---");
        spinach.displayInfo();
        System.out.println();
        System.out.println("--- Fruit ---");
        apple.displayInfo();
	}

}
