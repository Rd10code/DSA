public class passing_arrays{
    public static void update (int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }

    public static int update(int num){
        int number = num +1;
        return number;
    }
    public static void main(String[] args) {
        int marks[]={97,98,99}; 
        update(marks);

        //printing marks

        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]+" ");
        }

        System.out.print(update(45));

        System.out.println("This is new update");

        System.out.println("new update");
        
    }
}