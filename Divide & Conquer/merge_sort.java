public class merge_sort{

    public static void Printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void Merge_sort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = si + (ei-si)/2;
        Merge_sort(arr,si,mid);
        Merge_sort(arr,mid+1,ei);

        merge(arr , si, mid, ei);
    }

    public static void merge(int arr[], int si,  int mid, int ei){
        // left (0,3) = 4 elements , right (4,7)=4  --> 7-0+1=8;
        int temp[] = new int [ei-si+1]; 
        int i = si;   // Iterator for left part
        int j = mid+1; // Iterator for right part
        int k = 0; // Iterator fot Temp array


        // while (i<=mid && j<=ei) {
        //      if(arr[i]<arr[j]){
        //     temp[k]=arr[i];
        //     i++ ;
        //     k++;

        // }else{
        //     temp[k]=arr[j];
        //     j++;
        //     k++;
        // }
        // }

              while (i<=mid && j<=ei) {
             if(arr[i]>arr[j]){
            temp[k]=arr[j];
            j++ ;
            k++;

        }else{
            temp[k]=arr[i];
            i++;
            k++;
        }
        }

        //left part
        while(i<=mid){
            temp[k++]=arr[i++];
        }

        //Right part
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        // copy to the orinal from temp
        for(k=0 , i=si; k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
       
    }


    public static void main(String[] args) {
        int arr[]={6,3,9,-5,2,-8,-22};
        Merge_sort(arr, 0, arr.length-1);
        Printarr(arr);
    }
}