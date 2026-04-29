public class first_occurnace {
    public static int first(int arr[],int key,int i){
        if(i == arr.length-1){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return first(arr,key,i+1);
    }
    public static void main(String[] args) {
        int arr[]={11,2,3,4,5,6,7};
        System.out.print(first(arr, 11, 0));
    }    
}
