package Multithread;

public class Order extends Thread {
    public void run() {
        System.out.println("Order processing started");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Order processing completed");
    }
}