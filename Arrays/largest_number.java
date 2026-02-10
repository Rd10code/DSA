// import java.util.*;
public class largest_number {

    //First Aproch

    // public static int GetLargest(int numbers[]){
    //     int largest = Integer.MIN_VALUE;  //infinity
    //     for(int i=0;i<numbers.length;i++){
    //         if(largest<numbers[i]){
    //             largest =numbers[i];
    //         }
    //     }
    //     return largest;
    // }

    // public static int getsmallest(int numbers[]){
    //     int small = Integer.MAX_VALUE;
    //     for(int i=0;i<numbers.length;i++){
    //         if(numbers[i]<small){
    //             small=numbers[i];
    //         }
    //     }
    //     return small;
    // }

    // Second Approch

    public static int getinfo(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        System.out.println("Largest Value in the given array is "+ largest);
        System.out.println("Smallest Value in the given array is "+ smallest);
        return largest;
    }
    public static void main(String[]  args){
        int numbers[]={20,1,0,30,100,357,2243034,-12};

        System.out.print(getinfo(numbers));
        // System.out.println("The Largest Number in the Array is "+GetLargest(numbers));
        // System.out.println("The Smallest Number in the Array is "+getsmallest(numbers));

        
    }
}
