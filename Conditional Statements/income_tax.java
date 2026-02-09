import java.util.*;

public class income_tax {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int income =sc.nextInt();
        int tax=0;

        // if(income>800000){
        //     System.out.print("U have to pay 10% Tax ");
        //      tax = (int)(income*0.1);
        //     System.out.print(tax);
        // }else if(income>200000 && income <800000){
        //     System.out.print("U have tp pay 5% Tax");
        //     tax = (int)(income*0.05);
        //     System.out.print(tax);
        // }else if(income<200000){
        //     System.out.print("Ye Garib");
        // }
        // else{
        //     System.out.print("U have to pay 30% Tax");
        //     tax = (int)(income*0.3);
        //     System.out.print(tax);
        // }

        
        if(income>800000){
             tax = (int)(income*0.1);
            // System.out.print(tax);
        }else if(income>200000 && income <800000){
            tax = (int)(income*0.05);
            // System.out.print(tax);
        }else if(income<200000){
            System.out.print("Ye Garib");
        }
        else{
            tax = (int)(income*0.3);
            // System.out.print(tax);
        }
        System.out.print("U have to pay "+tax);
    }
}
