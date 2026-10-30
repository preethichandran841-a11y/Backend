package Multithread;

public class Store {
	boolean available = false;

    synchronized void consume(String name) {
        while (!available) {
            try {
                System.out.println(name + " is waiting");
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println(name + " consumed the product");
        available = false;
    }

    synchronized void produce() {
        System.out.println("Producer produces a product");

        available = true;
        notify();

        System.out.println("Producer notifies one consumer");
    }

    synchronized void produceForAll() {
        System.out.println("Producer makes product available");

        available = true;
        notifyAll();
    }
}
