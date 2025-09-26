package ex_004_Operators;

public class Lab043_Interview_Concatenation_QNA {
    public static void main(String[] args) {
        //Byte size in case of Non Primitive is 8 Byte and 64 Bits
        String first_name = "Bitan";
        String last_name = "Duari";

        int a = 10;
        int b = 10;
        System.out.println(first_name + last_name + a + b);
        System.out.println();
        // First_name is String so Operator for first time it will concatenate so later will be concatenation
        System.out.println(a + b + first_name + last_name);
        // In case of this since its starting with variable it will act as Normal operator and later change its nature
        // to Concatenation for First_name and Last_Name
        System.out.println();
        System.out.println(first_name + last_name + (a + b));
        // To make sum again we need to apply bracket to act as normal arithmetic operator instead of Concatenate.
        //BODMAS Principle
    }
}
