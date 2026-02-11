public class max_sum_subarrays_bruteforce {

    public static void sub(int num[]){
        int curr =0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                curr =0;
                for(int k=start;k<=end;k++){  //print
                    curr += num[k];
                }
                System.out.println(curr);
                if(max<curr){
                    max=curr;
                }
                
               
            }
        }
        System.out.print("Maximum Sum of the SubArrays : "+max);
    }
    public static void main(String[] args) {
        int numb[]={1,-2,6,-1,3};
        // sub(numb);
        sub(numb);
    }
}
