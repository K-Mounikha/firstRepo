//Find Youngest Age in Three in Java?
package assignment3;

public class Youngest_age {

	public static void main(String[] args) {
	int p1=52,p2=34,p3=23;
	int youngest_age=p1;
	if(p2<youngest_age) {
      youngest_age=p2;
	}
	if(p3<youngest_age) {
		youngest_age=p3;
	}
	System.out.println("youngest age: "+youngest_age);
		
	}

}
