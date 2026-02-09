import java.util.*;
public class area_of_circle {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        float pi = sc.nextFloat();
        // int a = sc.nextInt();
        int b = sc.nextInt();

        float area = pi*b*b;
        System.out.print(area);
        sc.close();


    }
}
