package Stack;
import java.util.*;
public class StackB{
    static class Stack{
        static ArrayList<Integer>List=new ArrayList<>();
        public static boolean isEmpty(){
            return List.size()==0;
        }

        //Push
        public static void push(int data){
            List.add(data);
        }   

        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = List.get(List.size()-1);
            List.remove(List.size()-1);
            return top;
        }

        //Peek
        public static int peek(){
             if(isEmpty()){
                return -1;
            }
            return List.get(List.size()-1);
        }
    }
    public static void main(String[] args){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
