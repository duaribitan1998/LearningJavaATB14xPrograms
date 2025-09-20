package ex_002_JavaBasics;

public class Lab024_PrintF {
    public static void main(String[] args) {
    int a = 10;
    int b = 20;
        // System.out.println(a);
        // System.out.println(b);

        System.out.println(a);
        System.out.println(b);

        //System.out.print(a);
        // System.out.print(b);

        System.out.print(a);
        System.out.print(b);

        System.out.println();

        //System.out.printf("Value of %d", a);
        //System.out.printf("Value of %d", b);

        System.out.printf("Value of a is %d", a).println();
        System.out.printf("Value of b is %d", b);
        // %d --> int, byte, long, short, -- data type
        // %s --> String
        // %f --> float, double
        // %b --> boolean
        }

}
