package ex_005_TypeCasting;

public class Type061_TypeCasting_Used {
    public static void main(String[] args) {
        int Course = 100;
        float GST = 18.45f;
       // int total = course+gst;  { Explicit --> Narrowing }
        int total = Course+(int)GST;
        //Narrowing --> Explicit
        System.out.println(total);

        float total2 = Course+GST;
        System.out.println(total2); // Implicit Auto Widening
    }
}
