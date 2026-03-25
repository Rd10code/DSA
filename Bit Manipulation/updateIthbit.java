public class updateIthbit {
     public static int SetIthbit(int n ,int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }

     public static int ClearIthbit(int n,int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }

    public static int updateIthbit(int n , int i,int newbit){
        // if(newbit==0){
        //     return ClearIthbit(n, i);
        // }else{
        //     return SetIthbit(n,i);
        // }

        
    }

    public static void main(String[] args) {
        
    }
}
