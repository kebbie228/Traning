package Generic;

public class ParameterizedClass {
    public static void main(String[] args) {
//        Info<String> info1 = new Info<>("Hello");
//        System.out.println(info1);
//        String s= info1.getValue();
//        System.out.println(s);
//
//        Info<Double> info2 = new Info<>(3142.2);
//        System.out.println(info2);
//       Double x= info2.getValue();
//        System.out.println(x);


    }
//    public void abc(Info<String> info){
//        String s=info.getValue();
//    }
    public void abc(Info<Integer> info){
        Integer I=info.getValue();
    }

}

class Info<T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{" +
                "value=" + value +
                '}';
    }

    public T getValue() {
        return value;
    }
}
class Parent{
    public void abc(Info<String> info){
        String s=info.getValue();
    }
}
class Child extends Parent{
    public void abc(Info<String> info){
        Integer i= Integer.valueOf(info.getValue());
    }
}