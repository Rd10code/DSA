import java.util.*;
public class product{
    public static int mul(int a, int b){
       int product = a*b;
        return product;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int pro = mul(a,b);
        System.out.println("a*b="+pro);
        sc.close();
    }
}