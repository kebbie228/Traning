package Multik2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankLock {
    public final static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
new Employee("Zaur",lock);
        new Employee("Elog",lock);
        new Employee("Docha",lock);
        new Employee("Sopa",lock);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        new Employee("Minyri",lock);
        new Employee("Iris",lock);

    }
}

class Employee extends Thread {
    private String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    public void run() {
        if (lock.tryLock()) {
        try {
//            System.out.println(name + " waiting...");
//            lock.lock();
                System.out.println(name + " cashing out");
                Thread.sleep(2000);
                System.out.println(name + " done his routine");
            } catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        finally{
                lock.unlock();
            }
        }
else System.out.println(name+" doesnt want to stay in queue and go away");
    }
}