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
        s1.roll_no =123;
        s1.pasworrd ="ABCD";
        // System.out.println(s1.pasworrd);
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=1000;

        // Copy constructor
        Student s2 = new Student(s1);
        s2.pasworrd ="XYZ";
        s1.marks[1]=101;
        // System.out.println("This is s2 name "+s2.name);
        // System.out.println("This is s2 password "+s2.pasworrd);
       

        for(int i=0;i<3;i++){
           System.out.println(s2.marks[i]+" ");
        }
    }
}

class Student{
    String name;
    int roll_no;
    String pasworrd;
    int marks[];

    // Shallow Copy Constructor
//    Student(Student s1){
//     marks = new int [3];
//     this.name = s1.name;
//     this.roll_no = s1.roll_no;
//     this.marks = s1.marks;
//    }

   // Deep Copy constructor
    Student(Student s1){
        marks=new int[3];
        this.name =s1.name;
        this.roll_no =s1.roll_no;
        for(int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }
}







    // Non-Paramertised contructor
    Student(){
        marks = new int [3];
    }
    // parametrizwed constructor
    Student(String name){
        marks = new int [3];
        this.name=name;
        System.out.println("Welcome Master "+name);
        System.out.println("Constrctor is called...");
    }
    Student(int roll_no){
        marks = new int [3];
        this.roll_no = roll_no;
    }
    Student(String name,int roll_no){
        marks = new int [3];
        this.name= name;
        this.roll_no = roll_no;
    }
}