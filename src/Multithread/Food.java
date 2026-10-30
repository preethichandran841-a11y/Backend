package Multithread;

public class Food {
	boolean ready = false;

	synchronized void collectFood() {
	    while (!ready) {
	        try {
	            System.out.println("Customer is waiting for food");
	            wait();
	        } catch (InterruptedException e) {
	            System.out.println(e);
	        }
	    }

	    System.out.println("Customer received the food");
	}

    synchronized void prepareFood() {
        System.out.println("Chef is preparing food");

        ready = true;

        System.out.println("Chef notifies the customer");
        notify();
    }
}
