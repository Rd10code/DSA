import java.util.*;
public class sum {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;

        float c = sc.nextFloat();
        float d = sc.nextFloat();
        float mul = c*d;

        System.out.print("sum: "+sum);
        System.out.print("mul : "+mul);
        
        sc.close();

    }   
}