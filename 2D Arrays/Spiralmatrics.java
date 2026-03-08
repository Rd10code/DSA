public class Spiralmatrics{

    public static void printSpiral(int matrics[][]){
        int Startrow = 0;
        int Endrow = matrics.length-1;
        int Startcol =0;
        int Endcol = matrics[0].length-1;

        while(Startrow<=Endrow && Startcol<=Endcol){
        // top
        for(int j =Startcol;j<=Endcol;j++){
            System.out.print(matrics[Startrow][j]+" ");
        }

        //right
        for(int i =Startrow+1;i<=Endrow;i++){
            System.out.print(matrics[i][Endcol]+" ");
        }
         
        //bottom
        for(int j=Endcol-1;j>=Startcol;j--){
            if(Startrow==Endrow){
                break;
            }
            System.out.print(matrics[Endrow][j]+" ");
        }
        //left
        for(int i =Endrow-1;i>=Startrow+1;i--){
            if(Startcol==Endcol){
                break;
            }
            System.out.print(matrics[i][Startcol]+" ");
        }
        Startrow ++;
        Startcol ++;
        Endrow --;
        Endcol --;
        }
        System.out.print("");
        
    }
public static void main(String[] args) {
    int matrics [][]={ {1,2,3},
                       {4,5,6},
                       {7,8,9},
                       {10,11,12}};

                       printSpiral(matrics);
}
}