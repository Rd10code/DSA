import java.util.*; 
public class classroom {
    public static void main(String[] args) {
        //create
        HashMap<String,Integer>hm=new HashMap<>();

        //Insert -0(1)
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",10);

        //Get -O(1)
        // int population= hm.get("India");
        // System.out.println( population) ;

        System.out.println(hm);

        // // contains Key
        // System.out.println(hm.containsKey("Chinaa"));  //Fzlse
        // System.out.println(hm.containsKey("China"));  //True

        //Remove -O(1)
        System.out.println( hm.remove("China")) ;
        System.out.println( hm) ;

        //Size
        System.out.println( hm.size()) ;

        //Is empty
        System.out.println( hm.isEmpty());

        //Clear
        hm.clear();
        System.out.println( hm) ;
    }
}
