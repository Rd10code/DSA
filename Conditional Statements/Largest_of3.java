import java.util.*;

public class Largest_of3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if((A>=B) && (A>=C)){
            System.out.print("A Number is the Gretest");
        }else if(B>=C){
            System.out.print("B is the Gretest");
        }else{
            System.out.print("C");
        }
        sc.close();
    }
}
