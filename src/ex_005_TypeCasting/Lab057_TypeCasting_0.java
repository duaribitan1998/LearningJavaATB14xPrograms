package ex_005_TypeCasting;

public class Lab057_TypeCasting_0 {
    public static void main(String[] args) {
        byte b = 10;
       // int a = b; // valid Syntax --> Implicit Casting --> Widening Casting
        // Implicit means automatically
       int a =(int)b;
       // This is known as Explicit means externally (Explicit widening Casting Nop required)
    }
}
