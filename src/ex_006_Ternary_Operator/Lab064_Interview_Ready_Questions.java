package ex_006_Ternary_Operator;

public class Lab064_Interview_Ready_Questions {
    public static void main(String[]args){
        int age = 26;
     // Nested Rules --> Two Conditions;
        String result = (age > 22) ?(age >= 27 ? "You can drink" : " You can go to Japan but you can't drink") : " NO";
        System.out.println(result);
    }
}
