import java.util.*;
public class iterat{
    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();

        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",10);
        hm.put("Indonasia",99);
        hm.put("Srilanka",99);
         
        //Iterate
        Set<String>Keys = hm.keySet();
        System.out.println(Keys) ;

        // for (String k : Keys) {
        //     System.out.println( "key= "+k+" values= "+hm.get(k)) ;
        // }

           for (String K : Keys) {
            System.out.println("keys: "+K+ " values: "+ hm.get(K));
        }
        


        
    }
}
