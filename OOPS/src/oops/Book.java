//8. Create a class representing a book, with private variables for title and author and a public method for displaying information about the book.
package oops;
public class Book {
	private String title;
    private String author;
    public Book(String title,String author) {
        this.title=title;
        this.author=author;
    }
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
    public static void main(String[] args) {
        Book b=new Book("Harry Potter","J.K.Rowling");
        b.displayInfo();

	}

}
