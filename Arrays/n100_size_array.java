public class n100_size_array  {

    public static void reverse(int arr[]){
        int start =0,end=arr.length-1;

        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args){
        int arr[]=new int[100];

        for(int i=0;i<arr.length;i++){
            arr[i]=i+1;
            System.out.print(arr[i]+" ");
        }

        System.out.println(" Reverse array is ");
        reverse(arr);
        
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }

        
    }
}
