package Multik;

public class Ex12 {
    public static void main(String[] args) {
        Friend1Mobile friend1Mobile = new Friend1Mobile();
        Friend2Skype friend2Skype = new Friend2Skype();
        Friend3whatsapp friend3whatsapp = new Friend3whatsapp();
        Thread thread1 = new Thread(friend1Mobile);
        Thread thread2 = new Thread(friend2Skype);
        Thread thread3 = new Thread(friend3whatsapp);
        thread1.start();
        thread2.start();
        thread3.start();
    }

    public void mobileCall() {
        System.out.println("Mobile call starts");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Mobile call ends");
    }

    public void skypeCall() {
        System.out.println("Skype call starts");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Skype call ends");
    }

    public void whatsappCall() {
        System.out.println("Whatsapp call starts");
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Whatsapp call ends");
    }

    static Object object = new Object();
}

class Friend1Mobile implements Runnable {

    @Override
    public void run() {
        synchronized (Ex12.object) {
            new Ex12().mobileCall();
        }
    }
}

class Friend2Skype implements Runnable {

    @Override
    public void run() {
        synchronized (Ex12.object) {
            new Ex12().skypeCall();
        }
    }
}

class Friend3whatsapp implements Runnable {

    @Override
    public void run() {
        synchronized (Ex12.object) {
            new Ex12().whatsappCall();
        }
    }
}