public class binary_search {

    public static int binarysearch(int number[],int key){
        int start = 0 , end = number.length-1;

        while (start<=end) {
            int mid = (start+end)/2;
            if(number[mid]==key){
                return mid;
            }//found case
            if(mid<key){
                start = mid+1;
            }//left case
            else{
                end = mid-1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int number[]={12,15,17,18,22,25,32};
        int key =27;

        System.out.print(binarysearch(number, key));

    }
}
