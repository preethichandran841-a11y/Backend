package Multithread;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Order t = new Order();
        System.out.println("State: " + t.getState());
        t.start();
        Thread.sleep(500);
        System.out.println("State: " + t.getState());
        t.join();
        System.out.println("State: " + t.getState());
        
        BankAccount b = new BankAccount();

        Thread t1 = new Thread(() -> b.withdraw(4000), "Thread 1");
        Thread t2 = new Thread(() -> b.withdraw(4000), "Thread 2");
        t1.start();
        t2.start();
        
        
        Food f = new Food();
        Thread customer = new Thread(() -> f.collectFood());
        customer.start();
        Thread.sleep(1000);
        synchronized (f) {
            f.prepareFood();
        }
        
        
        Result r = new Result();
        Thread s1 = new Thread(() -> r.checkResult("Student 1"));
        Thread s2 = new Thread(() -> r.checkResult("Student 2"));
        Thread s3 = new Thread(() -> r.checkResult("Student 3"));
        s1.start();
        s2.start();
        s3.start();
        Thread.sleep(1000);
        r.publishResult();
        
              
        Store s = new Store();
        Thread c1 = new Thread(() -> s.consume("Consumer 1"));
        Thread c2 = new Thread(() -> s.consume("Consumer 2"));
        Thread c3 = new Thread(() -> s.consume("Consumer 3"));
        c1.start();
        c2.start();
        c3.start();
        Thread.sleep(1000);
        s.produce();
       Thread.sleep(1000);
        s.produceForAll();
    }
}
