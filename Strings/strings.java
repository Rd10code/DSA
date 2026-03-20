import java.util.*;
public class strings{
    public static void main(String args[]){
        int arr[]={'a','b','c'};
        String str ="abcd";
        String str2= new String("xyz");

        //Strings are immutable
        Scanner sc = new Scanner(System.in);
        String name;
        String line;
        name = sc.next();
        line = sc.nextLine();
        System.out.println("Your name is " + name);
        System.out.println(line);
        sc.close(); 

        //Length
        System.out.print(line.length());
    }
}