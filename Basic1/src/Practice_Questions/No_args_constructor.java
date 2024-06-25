package Practice_Questions;

public class No_args_constructor {
	int empid;
	String ename;
	float sal;
	No_args_constructor()
	{
		empid=101;
		ename="A";
		sal=1000.0f;
	}
	public void disp()
	{
		System.out.println("empid:"+empid+ " "+"ename:"+ename+ " "+"sal:"+sal);
	}

	public static void main(String[] args) {
		 {
			 No_args_constructor obj1 = new No_args_constructor();
		     obj1.disp();
		     No_args_constructor obj2 = new No_args_constructor();
		     obj2.disp();
		  }

	}

}
