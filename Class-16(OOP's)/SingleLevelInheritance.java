public class SingleLevelInheritance {
    public static void main(String[] args) {
        Fish f = new Fish();
        f.eat();
        f.fins=2;
        System.out.println(f.fins);
    }
}

//base class
class Animal{
    String color;

    void eat(){
        System.out.println("Eating");
    }
}

//derived class
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swimming");
    }
}
