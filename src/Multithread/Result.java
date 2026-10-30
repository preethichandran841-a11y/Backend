package Multithread;

public class Result {
	boolean published = false;

    synchronized void checkResult(String name) {
        while (!published) {
            try {
                System.out.println(name + " is waiting for result");
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println(name + " received the result");
    }

    synchronized void publishResult() {
        System.out.println("Teacher publishes the result");

        published = true;

        notifyAll();
    }
}
