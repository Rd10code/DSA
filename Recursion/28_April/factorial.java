public class factorial {
    public static int factor(int num){
        int n = 1;
        for(int i=1;i<=num;i++){
            n = n * i;
        }
        return n;
    }
    public static void main(String[] args) {
        int x = 5;
        int ans = factor(x);
        System.out.print(ans);
    }
}
