public class incresing_number{

    // this is a normal function
    // public static void increnum(int n){
    //     for(int i=0;i<=n;i++){
    //         System.out.print(i+" ");
    //     }
    // }

    // Recursion
    public static void increnum(int n){
        if(n==1){
            System.out.print(n+" ");
            return ;
        }
        increnum(n-1);
        System.out.print(n+" ");

    }


    public static void main(String[] args) {
        increnum(10);
    }
}