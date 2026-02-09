import java.util.*;
public class keep_enterning_number_till_user_enter_multiple_of_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        do{
            int n = sc.nextInt();
            if(n%10==0){
                System.out.print("You have enter the invalid number");
                break;
            }
            System.out.println(n);
        }while(true);
        sc.close();
    }
    
}
