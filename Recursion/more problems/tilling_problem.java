public class tilling_problem{
    public static int TilPro(int n){   // 2 *n (Floor Size)
        if(n ==0 || n==1){
            return 1;
        }

        //Choice
        // vertical 
        int fnm1 =TilPro(n-1);

        //horizontal
        int fnm2 = TilPro(n-2);

        int total = fnm1+fnm2;

        return total;

    }

    public static void main(String[] args) {
        System.out.print(TilPro(4));
    }
}