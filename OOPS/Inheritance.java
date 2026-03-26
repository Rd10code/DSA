public class Inheritance {
    public static void main(String[] args) {

        // Single and Multilevel Inheritance
        
        Fish tuna = new Fish();
        tuna.eat();
        dogs dobby = new dogs();
        dobby.eat();
        dobby.legs = 4;
        dobby.breed = "husky";
        System.out.println(dobby.legs);
        System.out.println(dobby.breed);

        // You can Also Try Hirachical Inheritance



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

// Single level and multilevel Inheritance
class Mammal extends Animal{
  int legs;
   void walk(){
    System.out.print("walk");
  }
    
}
class dogs extends Mammal{
    String breed;
}


// Hirachial Inheritance

class Fish extends Animal{
  void Swim(){
    System.out.print("Swim");
  }
}

class Bird extends Animal{
  void Fly(){
    System.out.print("Fly");
  }
}

   


// Child Class or Derived Class
// class Fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("Swim");
//     }

//     void predict(){
//         System.out.println("it is the water predictor");
//     }
    
// }