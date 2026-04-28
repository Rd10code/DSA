public class decresing {
    public static void decred(int n){
        for(int i=n;i>=0;i--){
            System.out.println(i);
        }
    }

    // Decresing Numbers
    public static void Rec_decrese(int n){
        if(n==0){
            System.out.print(n);
            return;
        }
        System.out.println(n+" ");
        Rec_decrese(n-1);
    }

    // Increing Number
    public static void Recur_Incres(int n){
     if(n==1){
        System.out.print(n);
        return;
     }
    Recur_Incres(n-1);
    System.out.println(n +" ");
    }

    // Factorial of the number
    public static int Fact(int n){
        if(n==0){
            return 1;
        }
        int FN1 = Fact(n-1);
        int FN = FN1*n;
        return FN;
    }

    // Sum of First n natural numbers
   public static void natural(int n){
        if(n==1){
            System.out.print("1 " );
            return;
        }
        natural(n-1);
        System.out.print(n+" ");
   }

   //Fibonacci Series
   public static int Fib(int n){
    if(n==0 || n==1){
        return n;
    }
    int fibNm1 = Fib(n-1);
    int fibNm2 =Fib(n-2);
    int f = fibNm1 + fibNm2;
    return f;
   }

   // N times name print using recursion
   public static void names(int n , String name){
    if(n==1){
        System.out.println(name);
        return ;
    }
    System.out.println(name);
    names(n-1 , name);
   }
    public static void main(String[] args) {
        // decred(10);
        // Rec_decrese(10);
        // Recur_Incres(10);
        // int ans = Fact(5);
        // natural(10);
        // int ans = Fib(5);
        // System.out.print(ans);
        names(4, "Rohit");
        
    }
}
