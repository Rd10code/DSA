public class first_occurecence {
    public static int fioccur(int arr[],int key,int i){
        if(key==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return fioccur(arr, key, i+1);

    }
    public static void main(String[] args) {
        int arr[]={1,3,2,4,6,7,8,9,4};

        System.out.print("Your Element on ");
        System.out.print(fioccur(arr, 4, 0));
        System.out.print(" index");
    }
}
