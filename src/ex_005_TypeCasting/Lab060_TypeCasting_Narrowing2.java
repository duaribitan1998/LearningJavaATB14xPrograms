package ex_005_TypeCasting;

public class Lab060_TypeCasting_Narrowing2 {
    public static void main(String[] args) {
        long phone_num = 987654321l;
        short s = (short) phone_num; // Explicit --> Narrowing
        System.out.println(s);
    }
}
