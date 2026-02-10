public class print_sub_arrays {
    public static void subarrays(int num[]){
        int total =0;
        for(int i=0;i<num.length;i++){
            int start =i;
            for(int j=i;j<num.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){  //print
                    System.out.print(+num[k]+" ");   //subarrays
                }
                total++;
                System.out.println(" ");
            }
        }
        System.out.println(total);
    }
    public static void main(String[] args) {
        int numbers[] ={2,4,6,8,10};
        subarrays(numbers);
    }
}
