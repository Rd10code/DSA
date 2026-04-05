public class print_first_n_natural_no {

    public static int sum(int n){
        if(n==1){
            return 1;
        } 
        int Snm1 = sum(n-1);
        int Sn = n +Snm1;
        return Sn;

        // if(n==1){
        //     return 1;
        // }
        // // sum(n-1);
        // return n+sum(n-1);
    }
    public static void main(String[] args) {
        System.out.print(sum(4));
    }
}
