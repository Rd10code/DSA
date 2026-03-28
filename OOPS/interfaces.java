public class interfaces {
    public static void main(String[] args) {
        // Queen q = new Queen();
        // q.moves();

        bear b = new bear();
        b.eatplant();
        b.eatmeat();
    }
}

// Multiple Inheritance

interface herbivorous{
    void eatplant();
}

interface carnivorus{
    void eatmeat();
}
// multiple inheritance

class bear implements herbivorous , carnivorus{
    public void eatplant(){
        System.out.println( "It eats both hearbs & meat") ;
    }
    
    public void eatmeat(){
        System.out.println("it eats meat also");
    }
}

// Only class

// class bear {
//     public void eat(){
//         System.out.println( "It eats both hearbs & meat") ;
//     }
// }


interface chessplayer{
    void moves();
}

class Queen implements chessplayer{
    public void moves(){
        System.out.println("up , down , left , right , Diagonal");
    }
}

class Rook implements chessplayer{
    public void moves(){
        System.out.println("up , down , left , right");
    }
}

class king implements chessplayer{
    public void moves(){
        System.out.println("up , down , left , right, diagonal -(By 1 step)");
    }
}