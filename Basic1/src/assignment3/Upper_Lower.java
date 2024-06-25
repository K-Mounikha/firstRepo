//Write a program to check whether a character is uppercase or lowercase alphabet?
package assignment3;

public class Upper_Lower {

	public static void main(String[] args) {
	char ch='A';
	if(ch>='A'&& ch<='Z') {
		System.out.println("uppercase alphabet");
	}
	else if(ch>='a' && ch<='z') {
		System.out.println("lowercase alphabet");
	}
	else {
		System.out.println("its not an alphabet");
	}
	}

}
