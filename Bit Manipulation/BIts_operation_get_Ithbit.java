public class BIts_operation_get_Ithbit{
    public static int GetIthbit(int n, int i){
        int bitmask = 1<<i;
        if((n & bitmask)==0){
           return 0;
        }else{
          return 1;
        }

    }
    public static void main(String[] args) {
        System.out.print(GetIthbit(2,1));
    }
}