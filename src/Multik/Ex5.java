package Multik;

public class Ex5 {
    public static void main(String[] args) {
       MyThread5 myThread5=new MyThread5();
       myThread5.setName("Popiboy");
        myThread5.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Name of "  + myThread5.getName()
        +" Priority of myt5 " +myThread5.getPriority() );


    }
}
class MyThread5 extends Thread{
    @Override
    public void run() {
        System.out.println("privet");
    }

}