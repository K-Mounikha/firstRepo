package Practice_Questions;

public class Private_variables {
	private int empid;
	private String ename;
	Private_variables(int id,String name)
	{
		empid=id;
		ename=name;
	}
    public void show()
    {
    	System.out.println("empid:"+empid+ " "+"ename:"+ename);
    }
	public static void main(String[] args) {
	Private_variables p1=new Private_variables(101,"A");
    p1.show();
	}
    }

