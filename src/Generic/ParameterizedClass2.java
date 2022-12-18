package Generic;

public class ParameterizedClass2 {
    public static void main(String[] args) {
Pair<String,Integer> pair1=new Pair<>("Stas",2);
        System.out.println( pair1.getFistValue());
        System.out.println( pair1.getSecondValue());
        Pair<Integer,String> pair2=new Pair<>(3214,"king");
         System.out.println( pair2.getFistValue());
        System.out.println( pair2.getSecondValue());
    }
}
class Pair<V1,V2>{
private  V1 value1;
private V2 value2;


    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    public V1 getFistValue(){
        return value1;
    }
    public V2 getSecondValue(){
        return value2;
    }


}