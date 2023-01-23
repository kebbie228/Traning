package Multik;

public class Ex4 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Privet");
            }
        }).start();
        new  Thread(()-> System.out.println("pr")).start();
        new  Thread(()-> System.out.println("pri")).start();
        new  Thread(()-> System.out.println("Priv")).start();
    }
}
