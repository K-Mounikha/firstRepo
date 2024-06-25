package Practice_Questions;

public class AccessFactoryMethod {

	public static void main(String[] args) {
	FactoryMethod obj=FactoryMethod.getInstance();
	int id=obj.getid();
	System.out.println("id:"+id);
    String name=obj.getname();
    System.out.println("ename:"+name);
	}

}
