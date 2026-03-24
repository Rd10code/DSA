import java.util.*;
public class odd {

    public static void oddeven(int n){
        int bitmask = 1;
           System.out.print("Thinking");
        try {
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.println();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if((n & bitmask)==0){
            System.out.println("Even");
        }else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        oddeven(1);


        while(true){
            System.out.println("Enter the number or If u wanna quit the game");
            String input = sc.next();
            if(input.equalsIgnoreCase("quit")){
                System.out.println("Quitting the game...");
                System.out.println("Wait a moment");
            }
            int num = Integer.parseInt(input);
            oddeven(num);
        }
    }
}
