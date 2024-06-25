package Practice_Questions;

public class Private_var {
	    private int empid;
	    private String ename;

	    Private_var(int id, String name) {
	        empid = id;
	        ename = name;
	    }

	    public void show() {
	        System.out.println("empid: " + empid + " " + "ename: " + ename);
	    }

	    public int getid() {
	        return empid;
	    }

	    public String getName() {
	        return ename;
	    }

	    public static void main(String[] args) {
	        Private_var p1 = new Private_var(101, "A");
	        int id = p1.getid();
	        System.out.println("id: " + id);
	        p1.show(); // Display the details
	    }
	}


