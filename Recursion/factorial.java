public class factorial {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        
        int FN_1 = fact(n-1);
        int FN = FN_1 * n;
        return FN;


    }
    public static void main(String[] args) {
        int ans = fact(6);
        System.out.print(ans);
        
    }
}
