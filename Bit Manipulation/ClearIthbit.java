public class ClearIthbit {
    public static int ClearIthbit(int n,int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.print(ClearIthbit(10,1));
    }
}
