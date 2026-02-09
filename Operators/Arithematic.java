import java.util.Scanner;

public class Arithematic {
    public static void main(String arh[]){
        Scanner sc = new Scanner(System.in);
        int a = 10;
        int b = 20;
        System.out.println("add " + (a+b));
        System.out.println("Subtract " + (a-b));
        System.out.println("Multiply " + (a*b));
        System.out.println("division " + (a/b));
        System.out.println("modulo " + (b%a));
    }
}