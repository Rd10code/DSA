public class Substrings {
    public static String substring(String str , int si,int ei){
        String subst = "";
        for(int i=si;i<ei;i++){
            subst += str.charAt(i);
        }
        return subst;
    }
    public static void main(String[] args) {
        String str = "hello World";
        System.out.print(str.substring(0,5));

        // System.out.print(substring(str, 0, 3));
    }
}
