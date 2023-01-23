package Multik;

public class Ex6 implements Runnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new Ex6());
        thread.start();
        System.out.println("Method main. thread name = " + Thread.currentThread().getName());
    }


    @Override
    public void run() {
        System.out.println("Method run. thread name = " + Thread.currentThread().getName());
    }

}
