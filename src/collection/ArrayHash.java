package collection;

public class ArrayHash {
	    int rollNo;
	    String name;
	    int mark;

	    ArrayHash(int rollNo, String name, int mark) {
	        this.rollNo = rollNo;
	        this.name = name;
	        this.mark = mark;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        ArrayHash s = (ArrayHash) obj;
	        return rollNo == s.rollNo;
	    }

	    @Override
	    public int hashCode() {
	        return rollNo;
	    }

	    void display() {
	        System.out.println(rollNo + " " + name + " " + mark);
	    }
	}
