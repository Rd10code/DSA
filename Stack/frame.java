package Stack;
import java.lang.Thread.State;
import java.util.*;
public class frame {

    public static void pushatBottom(Stack<Integer>s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushatBottom(s, data);
        s.push(top);
    }

    public static String reverseString(String str){
       Stack<Character>s=new Stack<>();
       int idx =0;

       while(idx<str.length()){
        s.push(str.charAt(idx));
        idx++;
       }
       StringBuilder result = new StringBuilder();
       while(!s.isEmpty()){
        char curr = s.pop();
        result.append(curr);
       }
       return result.toString();
    }
    public static void main(String[] args) {
        //Stack Impplemention with Framework

        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println( s.size()) ;
        System.out.println( "") ;
        pushatBottom(s, 5);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

        System.out.println(reverseString("abC"));
    }
}
