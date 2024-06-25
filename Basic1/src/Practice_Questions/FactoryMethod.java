package Practice_Questions;

public class FactoryMethod {
	private int empid;
    private String ename;

    // Private constructor
    private FactoryMethod(int id, String name) {
        empid = id;
        ename = name;
    }
    public void show()
    {
    	System.out.println("empid:"+empid+ " "+"ename:"+ename);
    }
    public int getid() {
    	return empid;
    }
    public String getname() {
    	return ename;
    }
	public static FactoryMethod getInstance(){//factory method
		FactoryMethod obj=new FactoryMethod(101,"A");
		return obj;

	}

}
