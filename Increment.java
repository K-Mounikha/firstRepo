/*Consider the following code snippet:
int i = 10;
int n = i++%5;
What are the values of i and n after the code is executed?
What are the final values of i and n if instead of using the postfix increment operator (i++), you use the prefix version (++i))?
*/
package assignment2;

public class Increment {

	public static void main(String[] args) {
		int i = 10;
		int n = i++%5;
		System.out.println("i val:"+i);//11
		System.out.println("n val:"+n);//0
                int a=10;
		int b=++a%5;
		System.out.println("a val:"+a);//11
		System.out.println("b val:"+b);//1

	}

}
