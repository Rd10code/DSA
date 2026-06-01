import java.util.*;
public class operation{
    public static void main(String[] args) {

        //Java Collections Frameworks
       ArrayList<Integer>list = new ArrayList<>();

       //Add Elemnet
       list.add(1);
       list.add(2000);
       list.add(100);
       list.add(4);
       list.add(5);

       System.out.println( list.size()) ;

    //    for(int i=0;i<list.size();i++){
    //     System.out.print( list.get(i)+" ") ;
    //    }
    //    System.out.println( " ") ;


       //Reverse of arraylist
    //    for(int i=list.size()-1;i>=0;i--){
    //     System.out.print(list.get(i)+" ") ;
    //    }


    //O(n)
       //maximaum number in arraylist
       int max = Integer.MIN_VALUE;

       for(int i=0;i<list.size();i++){
            // if(list.get(i)>max){
            //     max=list.get(i);

            // }
                max=Math.max(list.get(i),max);
        }

       System.out.println(max);


    //    //Get Element
    // //    int Element = list.get(2);
    // //    System.out.println( Element);

    //    //Delete
    // //    list.remove(1);
    //    System.out.println(list); 

    //    //Set Element
    // //    list.set(1,10);
    // //    System.out.println( list);

    //    System.out.println(list.contains(2));


    }
}
