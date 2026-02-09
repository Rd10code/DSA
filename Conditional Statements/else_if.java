import java.util.*;
public class else_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age>18){
            System.out.print("U can drive");
        }
        else if(age==17){
            System.out.println("Ok allow him");
        }else{
            System.out.print("No U can't Drive");
        }
        sc.close();
    }
}
