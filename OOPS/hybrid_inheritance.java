public class hybrid_inheritance {
    public static void main(String[] args) {
        Animal Cheetah = new Animal();
        Cheetah.milk();
        Fish tuna = new Fish();
        tuna.milk();
        sharks baby_shark = new sharks();
        baby_shark.milk();
        baby_shark.Sharp();
      }
}

class Animal{
    String color;
    void milk(){
        System.out.println("It give Milk");
    }
}

class Fish extends Animal{
    void Swim(){
        System.out.println("Swim");
    }
}

class sharks extends Animal{
    void Sharp(){
        System.out.println("Has Sharp teeth");
    }
}

class Birds extends Animal{
    void Fly(){
        System.out.print("Fly");
    }
}

class Peacock extends Birds {
    void beauty(){
        System.out.println("is so much beautiful");
    }
    
}
