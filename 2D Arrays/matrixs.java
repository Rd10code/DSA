import java.util.*;
public class matrixs {

    public static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.print("True yout key found at ("+ i +","+j +")");
                    return true;
                }
                }
            }
            System.out.print("Not found");
            return false ;
        }
    
    public static void main(String args[]){
        int matrix [][] = new int [3][3];
        int n = 3,m=3;

        Scanner sc =new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }

        }  

          for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }  

       int key =sc.nextInt() ;
        search(matrix, 5);
        sc.close(); 
    }
}
