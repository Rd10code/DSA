import java.util.*;
public class print {
    public static int lar_small(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(largest<matrix[i][j]){
                    largest=matrix[i][j];
                }
            }
        }

        return largest;
    }


    public static boolean search(int matrixs[][],int key){
        for(int i=0;i<matrixs.length;i++){
            for(int j=0;j<matrixs[0].length;j++){
                if(matrixs[i][j]==key){
                    System.out.print("Your key is at ("+i+","+j+")");
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        int n = 3 ,m =3;
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
            System.out.print("");
        }
          for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
            
        }
        int lar = lar_small(matrix);
        System.out.print(lar+ "is the largest number in the whole matrix");
        sc.close();

        search(matrix, 8);
    }

}


