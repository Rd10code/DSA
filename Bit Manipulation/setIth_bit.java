import java.util.*;
public class setIth_bit {
    public static int SetIthbit(int n ,int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print(SetIthbit(1,2));
        int num = sc.nextInt();
        int n = sc.nextInt();
        System.out.print(SetIthbit(num,n));

    }
}
