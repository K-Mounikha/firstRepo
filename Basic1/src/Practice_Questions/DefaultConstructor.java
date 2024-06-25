package Practice_Questions;

public class DefaultConstructor {
	int empid;
	String ename;
	float sal;
	public void disp()
	{
		System.out.println("empid: "+empid+ " "+"ename: "+ename+ " "+"sal: "+sal);
	}
    public static void main(String[]args)
    {
    	DefaultConstructor d=new DefaultConstructor();
    	d.disp();
    }

}
