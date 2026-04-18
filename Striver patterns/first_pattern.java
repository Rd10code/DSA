import java.util.*;
public class first_pattern{

   public static void patter1(int n){
    for(int i =0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print("*");
        }
        System.out.println();
    }
   }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            int n = sc.nextInt();
            patter1(n);
            t--;
        }

    }
}