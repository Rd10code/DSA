public class max_sum_subarray_prefix_method {
    public static void sub(int num[]){
        int curr =0;
        int max=Integer.MIN_VALUE;
        int prefix[]=new int[num.length];

        prefix[0]=num[0];
        //Calculate prefix array
        for(int i=1;i<prefix.length-1;i++){
            prefix[i]=prefix[i-1]+num[i];   //num[i]  is the currect element (It means pehele wale sare element ka sum and current element ka sum)

        }
        
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                curr = start ==0 ?prefix[end] : prefix[end]-prefix[start-1];
                
                
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
