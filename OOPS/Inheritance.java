public class Inheritance {
    public static void main(String[] args) {
        Fish tuna = new Fish();
        tuna.eat();
    }
}

//Parent Class or base class
class Animal{
    String color;
    void eat(){
       System.out.println("eat");
    }

    void breathe(){
        System.out.println("Breathe");
    }
}

// Child Class or Derived Class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swim");
    }

    void predict(){
        System.out.println("it is the water predictor");
    }
    
}