public class lastOccurance {
    public static int LastOccur(int arr[], int key , int i){
        if(i==arr.length){
            return -1;
        }
        int Isfound = LastOccur(arr,key , i+1);
        if(Isfound == -1 && arr[i]==key){
              return i;   
        }
        //check with self  
        return Isfound;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,3,6};
        System.out.print(LastOccur(arr,3,0));
    }
}
