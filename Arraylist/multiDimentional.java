import java.util.ArrayList;

public class multiDimentional {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>mainlist = new ArrayList<>();
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        ArrayList<Integer>list3=new ArrayList<>();

        for(int i=1;i<=5;i++){
            list1.add(1*i);
            list2.add(2*i);
            list3.add(3*i);
        }

        list2.remove(3);
        list2.remove(2);

        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);
        System.out.println( mainlist) ;

        for(int i=0;i<mainlist.size();i++){
            ArrayList<Integer>currentlist= mainlist.get(i);
            for(int j=0; j<currentlist.size();j++){
                System.out.print(currentlist.get(j)+" ");
            }
            System.out.println(" ") ;
        }
    }
}
