public class HeirarchicalInheritance {
    public static void main(String[] args) {
        Human2 h = new Human2();
        h.eat();
        h.walk();
    }
}

class Animal2{
    void breath(){
        System.out.println("Breathing");
    }

    void eat(){
        System.out.println("Eating");
    }
}

//class  Mammal2 extends Animal2{
//    void walk(){
//        System.out.println("Walking");
//    }
//}
//
//class Fish2 extends Animal2{
//    void swim(){
//        System.out.println("Swimming");
//    }
//}
//
//class Bird2 extends Animal2{
//    void fly(){
//        System.out.println("Flying");
//    }
//}

class Human2 extends Animal2{
    void walk(){
        System.out.println("walking");
    }
}

