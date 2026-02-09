// import java.util.*;
// public class factorial {

//     public static int factoriall(int n){
//         int f=1;
//         for(int i=1;i<=n;i++){
//             f=f * i;
//         };
//         return f;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int ans = factoriall(4);
//         System.out.println(ans);
//         sc.close();
//     }
// }




public class factorial{
    public static int factt(int n){
        int f =1;
        for(int i = 1;i<=n;i++){
            f=f*i;
        }
        return f;
    }

    public static int coeffientfactorial(int n, int r){
        int nfact = factt(n);
        int rfact = factt(r);
        int mid = n-r;
        int nmrfact = factt((mid));

        int ans = nfact/(rfact*nmrfact);

        return ans;

    }
    public static void main(String args[]){
        // int ans = factt(4);
        // System.out.print(ans);

        System.out.print(coeffientfactorial(5, 2));
    }
}