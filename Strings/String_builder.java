public class String_builder{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char i='a';i<='z';i++){
            sb.append(i);
        }

        // timecomplexity O(26)
        System.out.print(sb.length());
    }
}