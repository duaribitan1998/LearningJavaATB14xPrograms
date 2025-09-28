package ex_006_Ternary_Operator;

public class Lab065_Interview_QNA_Max_Two_TO {
    public static void main(String[] args) {
        //Find the maximum number between the two number;
        int a = 10;
        int b = 20;
        System.out.println(Math.max(a,b));
      // Ternary Operator
        int max = a>b? a : b;
        System.out.println(max);
    }
}
