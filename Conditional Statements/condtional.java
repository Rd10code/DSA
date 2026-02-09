public class condtional {
    public static void main(String args[]){
        int age =1;

        if(age>=18){
            System.out.print("You Are Adult");
        }

        if(age>13 && age<18){
            System.out.print("Teenager");
        }
        if(age>0&& age<2){
            System.out.print("Baby");
        }

        else{
            System.out.print("Not adult");
        }
    }
}