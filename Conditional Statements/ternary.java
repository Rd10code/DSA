import java.util.*;
public class ternary {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int greater =(a>b)?a:b;
        System.out.print(greater +" is Greater");

        int num = sc.nextInt();
        String type = (num%2==0)?"Even":"Odd";
        System.out.print(type);
        sc.close();
       }
       
}
