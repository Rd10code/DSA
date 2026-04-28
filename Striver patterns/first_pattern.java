import java.util.*;
public class first_pattern{

//    public static void patter1(int n){
    for(int i =0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print("*");
        }
        System.out.println();
    }
   }

//    public static void patter2(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
   }
   
//    public static void pattern3(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j +" ");
        }
        System.out.println();
    }
   }
  
//    public static void pattern4(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(i);
        }
        System.out.println();
    }
   }
   
//    public static void pattern5(int n){
    for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
   }

//     public static void pattern5(int n){
//     for(int i=1;i<=n;i++){
//         for(int j=0;j<=n-i+1;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
//    }

// Done by the Striver

// public static void pattern6(int n){
    for(int i =n;i<=n;i--){
        for(int j =i;j<=i;j--){
            System.out.print(j);
        }
    }
}
   
public static void pattern5(int n){
    for(int i=n;i>=1;i--){
        for(int j=1;j>=i;j++){
            System.out.print(j);
        }
    }
}
   public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            int n = sc.nextInt();
            pattern5(n);
            t--;
        }

    }
}