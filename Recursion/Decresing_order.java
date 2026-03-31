public class Decresing_order {

    public static void Decval(int n){
        if(n==1){
            System.out.print(n);
            return ;
        }
        System.out.print(n+ " ");
        Decval(n-1);
    }

    
    public static void Incval(int n){
        if(n==100){
            System.out.print(n);
            return ;
        }
        System.out.print(n+ " ");
        Decval(n+1);
    }
    public static void main(String[] args) {
        int n = 10;
        // Decval(n);
        Incval(n);
        // Normal Way
        // for(int i = 10;i>=0;i--){
        //     System.out.print(i+" ");
        // }


    }
}
