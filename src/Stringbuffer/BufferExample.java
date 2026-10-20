package Stringbuffer;

public class BufferExample {
	public static void main(String[] args) {
        StringBuffer msg = new StringBuffer("Transaction Details: ");
        msg.append("Payment received. ");
        msg.append("Balance updated.");
     System.out.println(msg);
    }
}
