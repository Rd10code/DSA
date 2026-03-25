public class OOPS {
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColor("yellow");
        System.out.println(p1.getColor());
        p1.settip(6);
        System.out.println(p1.gettip());
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setColor("Black");
        System.out.println(p1.getColor());

        bankaccount Myaccount = new bankaccount();
        Myaccount.username ="Rohit";
        System.out.println("Your username is " + Myaccount.username);
        // Myaccount.password ="ABCD";
        Myaccount.setpasword("ABCD");
        Myaccount.Getpass();
    }
}

class bankaccount{
    public String username;
    private String password;
    public void setpasword(String pwd){
        password = pwd;
    }

    public String Getpass(){
        System.out.print(password);
        return password;
    }



}
class Pen{
    // properties

    private String color ;
    private int tip;

    String getColor(){
        return this.color;
    }

    int gettip(){
        return this.tip;
    }

    void setColor(String newcolor){
        color = newcolor;
    }

    void settip(int newtip){
        tip = newtip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void Calper(int math,int phy , int chem){
        percentage = (math+phy+chem)/3;
    }

}
