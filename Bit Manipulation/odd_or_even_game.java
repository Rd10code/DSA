import java.util.*;
public class odd_or_even_game {

    public static void OddorEven(int n){
        int bitmask = 1;
        System.out.print("Thinking");
        try{
            Thread.sleep(500);
            System.out.print(".");
             Thread.sleep(500);
            System.out.print(".");
             Thread.sleep(500);
            System.out.print(".");
            System.out.println("");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
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
        // OddorEven(2);
        // OddorEven(11);
        // OddorEven(113);

        while (true) {
            System.out.println("Enter the number or If You wanna Quit Type Quit");
            String input = Scan.next();

            if(input.equalsIgnoreCase("quit")){
                 System.out.print("Quitting the game");
                try{
                    Thread.sleep(500);
                    System.out.print(".");
                    Thread.sleep(500);
                    System.out.print(".");
                     Thread.sleep(500);
                    System.out.print(".");
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
               
                break;
            }

            int number = Integer.parseInt(input);
            OddorEven(number);
        }
        Scan.close();
        
    }
    
}
