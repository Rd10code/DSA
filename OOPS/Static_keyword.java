public class Static_keyword {
    public static void main(String[] args) {
        student s1 = new student();
        // s1.name="Rohit";
        s1.school_name ="JNV";
        System.out.println(s1.school_name);
        student s2 = new student();
        System.out.println(s2.school_name);

        student s3 = new student();
        s3.school_name ="ABC";
        System.out.println(s2.school_name);
        System.out.println(s3.school_name);



    }    
}

class student{
    String name;
    int roll;
    static String school_name;
    int percentage;

    void set_name(String name){
        this.name = name;
    }
    String get_name(){
        return this.name;
    }
}