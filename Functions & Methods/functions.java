// import java.util.*;
public class functions{
    public static void  helloworld(){
        for(int i=0;i<=10;i++){
         System.out.println("Hello World");
        }
        return;
    }

    public static int calculatesum(int a , int b){
        int sum = a+b;
        return sum;
      
    }

    public static void swap(int a,int b){
       int temp = a;
        a=b;
        b=temp;
        System.out.println("a = "+a);
        System.out.print("b = "+b);
        return;
    }
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b= sc.nextInt();
       
        // int sum = calculatesum(a,b);
        // System.out.println("Sum is = "+ sum);
        // sc.close();


        // swap a and b 

        int a = 5;
        int b = 10;
        swap(a,b);
        
    }
}