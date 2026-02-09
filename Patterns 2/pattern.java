public class pattern{
    public static void hollow_rectangle(int totrows, int totcol){
        for(int i =1;i<=totrows;i++){
            for(int j=1; j<=totcol;j++){
                //cell - i,j
                if(i==1|| totrows ==4 || j==1|| totcol==5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow_rectangle(5, 4);
    }
}