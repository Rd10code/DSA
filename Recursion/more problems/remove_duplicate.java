public class remove_duplicate {

    public static String DupStr(String str){
        String n = " ";
        for(int i = 0;i>=str.length;i++){
            if(str.charAt(i)==n){
                n =+ n;
            }
        }
        return n;
    }
public static void main(String[] args) {
    
}    
}

