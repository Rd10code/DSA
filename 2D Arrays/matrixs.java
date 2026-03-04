import java.util.*;
public class matrixs {

    public static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("True your key found at ("+ i +","+j +")");
                    return true;
                }
                }
            }
            System.out.print("Not found");
            return false ;
        }

        public static int[] largest(int matrix[][]){
            int largest = Integer.MIN_VALUE;
            int Smallest = Integer.MAX_VALUE;
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    if(largest<matrix[i][j] ){
                        largest=matrix[i][j];
                    }
                    if(Smallest>matrix[i][j]){
                        Smallest=matrix[i][j];
                    }

                }
            }
            // System.out.print(largest);
            return new int[]{largest,Smallest};
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

        System.out.println("Enter the number You wanna search :" );
        System.out.println("");
       int key =sc.nextInt() ;
        search(matrix, key);

        int [] largest_smallest = largest(matrix);
        System.out.println("Largest Element is "+ largest_smallest[0]);
        System.out.println("Smallest Element is "+ largest_smallest[1]);
        sc.close(); 
    }
}
