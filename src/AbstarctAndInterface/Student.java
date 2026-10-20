package AbstarctAndInterface;

public class Student {
	 private String name;
	    protected int rollNo;
	    protected String college;
	    private String password;
        Student() {
	        name = "Preethi";
	        rollNo = 101;
	        college = "ABC College";
	        password = "12345";
	    }

	    public String getName() {
	        return name;
	    }

	    public String getPassword() {
	        return password;
	    }

}
