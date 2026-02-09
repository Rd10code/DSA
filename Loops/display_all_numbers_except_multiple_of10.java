import java.util.*;

public class display_all_numbers_except_multiple_of10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        do {
            n = sc.nextInt();

            if (n % 10 == 0) {
                System.out.println("This is a multiple of 10");
                continue;
            }

            System.out.println(n);

        } while (n != -1);   // stop when -1 entered

        sc.close();
    }
}
