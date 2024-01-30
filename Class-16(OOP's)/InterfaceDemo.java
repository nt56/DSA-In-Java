public class InterfaceDemo {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.move();
    }
}

interface ChessPlayer{
    void move();
}

class Queen implements ChessPlayer{
    @Override
    public void move(){
        System.out.println("Up,down,diagonal,left,right");
    }
}

class Rook implements ChessPlayer{
    @Override
    public void move() {
        System.out.println("up,down,left,right");
    }
}

class King implements ChessPlayer{
    @Override
    public void move() {
        System.out.println("up,down,left,rightBottom,leftBottom,");
    }
}
