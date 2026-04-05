public class factorial {

    //normal method

    public static int norfact(int n){
        int fact = 1;
     for(int i=1;i<=n;i++){
        fact = fact*i;
     }
     return fact;
    }

    //Recursion
    // public static int fact(int n){
    //     if(n==0){
    //         return 1;
    //     }
        
    //     int FN_1 = fact(n-1);
    //     int FN = FN_1 * n;
    //     return FN;


    // }
    public static void main(String[] args) {
        // int ans = fact(6);
        // System.out.print(ans);

        int ans =norfact(5);
        System.out.println( ans) ;
        
    }
}
