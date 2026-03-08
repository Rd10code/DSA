public class diagonal_sum {

    public static int Diasum(int matrics[][]){
        int sum = 0;

        for(int i=0;i<matrics.length;i++){
            for(int j=0;j<=matrics[0].length;j++){
                //Primarry Diagonal
                if(i==j){
                    sum+=matrics[i][j];
                }
                else if(i+j==matrics.length-1){
                    sum+=matrics[i][j];
                }
            }
            
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrics[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        int sum = Diasum(matrics);
        System.out.print(sum);
    }   
}
