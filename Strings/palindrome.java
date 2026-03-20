public class palindrome {
    public static  boolean check_palindrome(String str){
        int n = str.length();
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                // System.out.print("Your string is not pallidrome");
               return false;
            }
        }
        // System.out.print("Your string is pallidrome");
        return true;

    }
    public static void main(String args[]){
        String str = "noonn";
        System.out.print(check_palindrome(str));
    }
}
