import java.util.*;
public class odd_or_even {

    public static void OddorEven(int n){
        int bitmask = 1;
        if((n & bitmask)==0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
    }
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = Scan.nextInt();

        OddorEven(num);
        OddorEven(2);
        OddorEven(11);
        OddorEven(113);

        while (true) {
            System.out.println("Enter the number or If You wanna Quit Type Quit");
            String input = Scan.next();

            if(input.equalsIgnoreCase("quit")){
                System.out.println("Quitting the game...");
                break;
            }

            int number = Integer.parseInt(input);
            OddorEven(number);
        }
        Scan.close();
        
    }
    
}
