public class super_class{
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
        
    }
}

class Animal {
    String color;
    Animal (){
        System.out.println("Animal Contructor is called");
    }
}

class Horse extends Animal{
    Horse(){
        super();
        super.color = "Brown";
        System.out.println("Horse Constructor is called");
    }
}