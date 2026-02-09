import java.util.*;

public class q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.print("Year is Leap Year");
        } else {
            System.out.print("Not Leap");
        }
       sc.close(); 
    }
}
