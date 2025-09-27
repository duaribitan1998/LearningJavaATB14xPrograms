package ex_004_Operators;

public class Lab048_Interview {
    public static void main(String[] args) {
 int balaji_salary = 12;
 boolean b = (!(balaji_salary>10 || balaji_salary<5));
        System.out.println(b);

        // A --> 12>10 --> true
        // B --> 12<5 --> false

        // According to OR Gate if one is True Output will be True
        // But here we are doing reverse so main output will be False
        // example (!True) --> False
    }
}
