public class odd_or_even {

    public static void OddorEven(int n){
        int bitmask = 1;
        if((n & bitmask)==0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
    }
    public static void main(String[] args) {
        OddorEven(2);
        OddorEven(11);
        OddorEven(113);
        
    }
}
