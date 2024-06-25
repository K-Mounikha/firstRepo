package Practice_Questions;

public class Singleton {
	 private int empid;
	    private String ename;
	    private static Singleton obj;
	    private Singleton(int id, String name) {
	        empid = id;
	        ename = name;
	    }
	    public static Singleton getInstance() { // factory method
	        if (obj == null) {
	            obj = new Singleton(101, "A");
	        }
	        return obj;
	    }

	    public void show() {
	        System.out.println("empid:" + empid + " " + "ename:" + ename);
	    }

	    public int getid() {
	        return empid;
	    }

	    public String getname() {
	        return ename;
	    }

	    public static void main(String[] args) {
	        Singleton s = Singleton.getInstance();
	        int id = s.getid();
	        System.out.println("id: " + id);
	    }
}


