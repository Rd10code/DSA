public class Constructors {
    public static void main(String[] args) {
        // Student s1 = new Student("Rohit");
        // System.out.println(s1.name);
        // Student s2 = new Student(123);
        // System.out.println(s2.roll_no);
        // Student s3 = new Student();
        // Student s4 = new Student("Rd",1234);
        // System.out.println(s4.name+" " +s4.roll_no);

        Student s1 = new Student();
        s1.name = "Rohit";
        s1.roll_no = 1234;
        s1.pasworrd = "abcd";

        // Copy Constructor
        Student s2 = new Student(s1);
        s2.pasworrd="xyz";


    }
}

class Student{
    String name;
    int roll_no;
    String pasworrd;

    // Copy Constructor
    Student(Student s1){
        this.name = name;
        this.roll_no = roll_no;
    }
    
    // Non-Paramertised contructor
    Student(){

    }
    // parametrizwed constructor
    Student(String name){
        this.name=name;
        System.out.println("Welcome Master "+name);
        System.out.println("Constrctor is called...");
    }
    Student(int roll_no){
        this.roll_no = roll_no;
    }
    Student(String name,int roll_no){
        this.name= name;
        this.roll_no = roll_no;
    }
}