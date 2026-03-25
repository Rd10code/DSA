package OOPS;
import java.sql.Struct;
import java.util.*;
public class pen_color_changer {
    public static void changecolor(char c){
        if(c=='R'){
            System.out.println("Pen Color set to Red");
        }else if(c=='B'){
            System.out.println("Pen Color set to Blue");
        }else if (c =='B'){
            System.out.println("Pen Color set to Black");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Do you wanna change the color of the pen");
            String input = sc.next();

            if(input.equalsIgnoreCase("Quit")){
                System.out.print("Existing...");
                break;
            }
            char command = input.charAt(0);
            if(command == 'y'|| command 'Y'){
                System.out.println("Which Color you want R,B,B");
                char color = sc.next().charAt(0);
               System.out.print("Thinking")
            }
               try{
                    Thread.sleep(500);
                    System.out.print(".");
                    Thread.sleep(500);
                    System.out.print(".");
                    Thread.sleep(500);
                    System.out.print(".");

                }catch(Exception e ){
                    e.getStackTrace();
                }
                changecolor();
            }
        }
    }
}
