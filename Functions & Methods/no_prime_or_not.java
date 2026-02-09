public class no_prime_or_not {

    //Nnormal Method
//   public static boolean isprime(int n ){
//     boolean isprime = true;
//     for(int i=2;i<=n-1;i++){
//         if(n%2==0){
//             isprime=false;
//             break;
//         }
//     }

    // Otimized Way
    public static boolean isprime(int n){
        boolean isprime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
                
            }
    }
    return isprime;
}

    public static void primerange(int n){
        for(int i=2;i<=n;i++){
            if(isprime(i)==true){
                System.out.print(i+" ");
            }
            // System.out.print("");
        };
    };
  
    
    public static void main(String[] args) {
    //    System.out.print( isprime(16));
    primerange(1000);
    };
};
