import java.util.*;
public class pass_or_fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Marks: ");
        int marks = sc.nextInt();

        String result = (marks>33)?"Pass":"Fail";
        System.out.print(result);

    }
}
