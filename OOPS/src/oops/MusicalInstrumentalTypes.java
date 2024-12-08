/*23.Create an interface for a musical instrument, with methods for playing and
  tuning, and subclasses for different types of instruments like guitar and piano.
 */
package oops;
interface MusicalInstrument {
    void play();
    void tune();
}
class Guitar implements MusicalInstrument {
    private String brand;
    private int numberOfStrings;

    public Guitar(String brand, int numberOfStrings) {
        this.brand = brand;
        this.numberOfStrings = numberOfStrings;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
    public void play() {
        System.out.println("Playing the guitar.");
    }
    public void tune() {
        System.out.println("Tuning the guitar.");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Number of Strings: " + numberOfStrings);
    }
}
class Piano implements MusicalInstrument {
    private String brand;
    private int numberOfKeys;

    public Piano(String brand, int numberOfKeys) {
        this.brand = brand;
        this.numberOfKeys = numberOfKeys;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }
    public void play() {
        System.out.println("Playing the piano.");
    }
    public void tune() {
        System.out.println("Tuning the piano.");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Number of Keys: " + numberOfKeys);
    }
}

public class MusicalInstrumentalTypes {

	public static void main(String[] args) {
		MusicalInstrument myGuitar = new Guitar("Fender", 6);
        MusicalInstrument myPiano = new Piano("Yamaha", 88);

        System.out.println("Guitar Info:");
        ((Guitar) myGuitar).displayInfo();
        myGuitar.play();
        myGuitar.tune();

        System.out.println("\nPiano Info:");
        ((Piano) myPiano).displayInfo();
        myPiano.play();
        myPiano.tune();

	}

}
