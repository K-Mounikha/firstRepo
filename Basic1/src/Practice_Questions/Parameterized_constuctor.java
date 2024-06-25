package Practice_Questions;

public class Parameterized_constuctor {
	int empid;
	String ename;
	float sal;
	//parameterized constructor
	Parameterized_constuctor(int id,String name,float salary)
	{
		empid=id;
		ename=name;
		sal=salary;
	}
	
    public void disp()
    {
    	System.out.println("empid:"+empid+ " "+"ename:"+ename+" "+"sal:"+sal);
    }
	public static void main(String[] args) {

	Parameterized_constuctor p1=new Parameterized_constuctor(101,"A",1000.0f);
	p1.disp();
	Parameterized_constuctor p2=new Parameterized_constuctor(102,"B",2000.0f);
	p2.disp();
	
	}

}
