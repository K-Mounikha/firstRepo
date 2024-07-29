//15.Implement an interface for a printable object, with subclasses for different types of printable documents like PDF and HTML.
package abstraction;
interface printable
{
	public abstract void print();
}
class PdfPrint implements printable
{
	public void print()
	{
		System.out.println("This is the pdf document");
	}
}
class Html implements printable
{
	public void print() {
		System.out.println("This is html document");
	}
}

public class PrintableInterface {

	public static void main(String[] args) {
		PdfPrint p=new PdfPrint();
		p.print();
		Html h=new Html();
		h.print();

	}

}
