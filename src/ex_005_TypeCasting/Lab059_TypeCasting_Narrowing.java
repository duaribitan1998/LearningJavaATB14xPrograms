package ex_005_TypeCasting;

public class Lab059_TypeCasting_Narrowing {
    public static void main(String[] args) {
        int val = 300;
        //byte b = val; // Narrowing Implicit (Not Valid)
        byte b = (byte) val; // Narrowing Explicit --> Valid Syntax
    }
}
