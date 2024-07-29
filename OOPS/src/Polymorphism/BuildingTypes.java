//18.Create a class hierarchy for different types of buildings using inheritance, with subclasses for homes, offices, and schools.
package Polymorphism;

class Building {
    private String address;
    private int floors;
    Building(String address, int floors) {
        this.address = address;
        this.floors = floors;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getFloors() {
        return floors;
    }
    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void displayInfo() {
        System.out.println("Address: " + address);
        System.out.println("Floors: " + floors);
    }
}
class Home extends Building {
    private int bedrooms;
    Home(String address, int floors, int bedrooms){
        super(address, floors);
        this.bedrooms = bedrooms;
   }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bedrooms: " + bedrooms);
    }
}
class Office extends Building {
    private int conferenceRooms;
    private boolean hasCafeteria;

     Office(String address, int floors, int conferenceRooms, boolean hasCafeteria) {
        super(address, floors);
        this.conferenceRooms = conferenceRooms;
        this.hasCafeteria = hasCafeteria;
    }

    public int getConferenceRooms() {
        return conferenceRooms;
    }

    public void setConferenceRooms(int conferenceRooms) {
        this.conferenceRooms = conferenceRooms;
    }

    public boolean hasCafeteria() {
        return hasCafeteria;
    }

    public void setHasCafeteria(boolean hasCafeteria) {
        this.hasCafeteria = hasCafeteria;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Conference Rooms: " + conferenceRooms);
        System.out.println("Has Cafeteria: " + hasCafeteria);
    }
}
class School extends Building {
    private int classrooms;
    private boolean hasPlayground;

    School(String address, int floors, int classrooms, boolean hasPlayground) {
        super(address, floors);
        this.classrooms = classrooms;
        this.hasPlayground = hasPlayground;
    }

    public int getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(int classrooms) {
        this.classrooms = classrooms;
    }

    public boolean hasPlayground() {
        return hasPlayground;
    }

    public void setHasPlayground(boolean hasPlayground) {
        this.hasPlayground = hasPlayground;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Classrooms: " + classrooms);
        System.out.println("Has Playground: " + hasPlayground);
    }
}
public class BuildingTypes {

	public static void main(String[] args) {

        Home myHome = new Home("visakhapatnam", 2, 2);
        Office myOffice = new Office("hyderabad", 10, 5, true);
        School mySchool = new School("parvathipuram", 3, 5, true);

        System.out.println("Home Info:");
        myHome.displayInfo();
        System.out.println("\nOffice Info:");
        myOffice.displayInfo();
        System.out.println("\nSchool Info:");
        mySchool.displayInfo();
     }
 }