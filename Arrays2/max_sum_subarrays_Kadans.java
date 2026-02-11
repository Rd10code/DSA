public class max_sum_subarrays_Kadans {

    public static void kadens(int number[]){
        int cs=0;
        int ms = Integer.MIN_VALUE;

        for(int i=0;i<number.length;i++){
            cs = cs+number[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(ms, cs);
        }
        System.out.print(ms);
    }
    public static void main(String[] args) {
        int num[] ={-2,-3,4,-1,-2,1,5,-3};
        kadens(num);
    }
}
