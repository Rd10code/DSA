import java.util.*;
public class oddeven {
    public static void main(String arg[]){
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();

        if(num%2==0){
            System.out.print("Number is even");
        }else{
            System.out.print("odd");
        }
        sc.close();
    }
    
}
