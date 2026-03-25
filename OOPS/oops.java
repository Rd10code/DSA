public class OOPS {
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColor("yellow");
        System.out.println(p1.color);
        p1.settip(6);
        System.out.println(p1.tip);
        p1.setColor("Blue");
        System.out.println(p1.color);
    }
}

class Pen{
    // properties

    String color ;
    int tip;

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
        percentage = math+phy+chem/3;
    }

}
