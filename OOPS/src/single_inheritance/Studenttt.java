//3.Program to print library record of student using single inheritance in java.
package single_inheritance;

public class Studenttt {
	String name="Mouni";
	int stuid=884;
	
	public void details() {
		System.out.println("Name :"+name);
		System.out.println("student id :"+stuid);	
	}
	
}
class LibraryRecord extends Studenttt{
	String booktitle="Java programming";
	String issuedate="15-06-2024";
	String reportdate="30-06-2024";
	
	public void displaydetails() {
		System.out.println("the name of the book is :"+booktitle);
		System.out.println("book issued on :"+issuedate);
		System.out.println("book returned on :"+reportdate);

		
		
	}
	public static void main(String[] args) {
		Studenttt s=new Studenttt();
		LibraryRecord lb=new LibraryRecord();
		s.details();
		lb.displaydetails();
	}
}
