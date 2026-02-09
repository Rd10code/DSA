import java.util.Scanner;

public class unary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //post Increment
        // int a =10;
        // int b =a++;
        // System.out.println(a);
        // System.out.println(b);

        //Preincrement
        int a =10;
        int b =++a;
        System.out.println(a);
        System.out.println(b);
        sc.close();
    }
}
