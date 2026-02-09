import java.util.*;
public class display_all_numbers_exect_multiple_of10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        do{
            int n = sc.nextInt();
            if(n%10==0){
                System.out.println("This is the multiple of 10");
                continue;
            }
            System.out.println(n);
            //   sc.close();
        }while(true);

      

    }
}
