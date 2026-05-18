public class transversal {
    //Maximum

    public static int max(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    //Minimum
      public static int min(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    //Count Even & odd number & zero
    public static int[] Count(int arr[]){
        int even = 0;
        int odd = 0;
        int zero =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zero+=1;
            }
            else if(arr[i]%2==0){
                even+=1;
            }else{
                odd+=1;
            }
        }
        return new int[]{even,odd,zero};
        //  return new int[]{even, odd, zero};
    }

    // linear search
    public static int Lin_search(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    //reverse the array
    public static void reverse(int arr[]){
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }

    //printing array
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }


        public static void reversceTran(int arr[]){
           int start = 0;
           int end = arr.length-1;

           while(start<end){
                int temp = start;
                start=end;
                end = temp;

                start++;
                end--;
           }
               
    }
    public static void main(String[] args) {

        //reverse
        
        //Trasversal
        int arr[]={9,-001,22,-13,4,0};
        reverse(arr);
        System.out.println( "Printing the reverse of the Array") ;
        print(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        //sum of array
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        System.out.println( sum) ;

        System.out.println(max(arr));
        System.out.println(min(arr));
        
        int result[] = Count(arr);
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);

       int index = Lin_search(arr, -11);
       System.out.println( index) ;
    }
}
