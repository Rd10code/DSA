public class abtraction {
    public static void main(String[] args) {
        // horse h = new horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);
        
        // chicken c = new chicken();
        // c.eat();
        // c.walk();
        // c.changecolor();



        // Constrctor Hirracy
        // Animal-->horse-->mustang           Inhertance of the constructor in the class
        mustang m = new mustang();
        m.walk();
    }
    
}

abstract class Animal{
    String color;
    
    Animal(){
        // color ="Brown";
        System.out.println("Animal Constructor is Called");
    };

    void eat(){
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class horse extends Animal{
    horse(){
        System.out.println( "Horse Construtor is called");
    }
    void walk(){
        System.out.println("Horse walk on 2 legs");
    }
    void changecolor(){
        color ="dark Brown"; 
    }
}

class mustang extends horse{
    mustang(){
        System.out.println("Mustang Construtor is called");
    }
   
}

class chicken extends Animal{
    void walk(){
        System.out.println( "Chicken Walk on 2 legs");
    }
      void changecolor(){
        color ="Yellow";
    }
}
