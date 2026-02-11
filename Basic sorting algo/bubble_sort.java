import java.util.*;
public class bubble_sort {

    public static void bubbleSort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                //Swapping
                if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                }
            }
        }
    }


    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] args) {

        int arr[] = {
    42, 7, 19, 73, 4, 88, 31, 56, 12, 95,
    63, 28, 1, 77, 34, 50, 9, 81, 22, 67,
    3, 99, 45, 16, 70, 5, 39, 84, 26, 60,
    11, 91, 37, 2, 53, 74, 18, 65, 30, 8
};


        bubbleSort(arr);

        printarr(arr);



    }
    
}
