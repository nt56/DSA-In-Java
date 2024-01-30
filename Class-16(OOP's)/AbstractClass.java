public class AbstractClass {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

//        Chicken c = new Chicken();
//        c.eat();
//        c.walk();
    }
}

abstract class Animal5{
    String color;

    Animal5(){
        color = "brown";
    }

    void eat(){
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends Animal5{
    void changeColor(){
        color = "dark brown";
    }

    @Override
    void walk() {
        System.out.println("Walk on 4 legs");
    }
}

class Chicken extends Animal5{
    @Override
    void walk() {
        System.out.println("Walk on 2 legs");
    }
}
