import java.util.*;
public class dec{
    public static void decnum(int n){
        if(n==0){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        decnum(n-1);

    }
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int n = scan.nextInt();
        decnum(n);

        scan.close();
        
    }
}