public class BIts_operation{
    public static void GetIthbit(int n, int i){
        int bitmask = 1<<i;
        if((n & bitmask)==0){
            System.out.print("0");
        }else{
            System.out.print("1");
        }

    }
    public static void main(String[] args) {
        GetIthbit(2,1);
    }
}