//6.Create a class representing a person, with private variables for name and age and public methods for accessing and modifying them.
package Encapsulation;
public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age=age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age=age;
    }
    public static void main(String[] args) {
        Person person = new Person("A",25);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        person.setName("Bob");
        person.setAge(30);

        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());
    }


	}


