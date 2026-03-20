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
        
        //Length
        System.out.print(line.length());
        
        //contatention
        String First_name = sc.next();
        String last_name = sc.next();
        System.out.println(First_name+" "+last_name);
        sc.close(); 
    }
}