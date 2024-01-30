public class MultiLevelInheritance {
    public static void main(String[] args) {
        Dog tom = new Dog();
        tom.eat();
        tom.bark();
    }
}

class Animal1{
    String color;

    void eat(){
        System.out.println("Eating");
    }
}

class Mammal extends Animal1{
    int legs;
}

class Dog extends Mammal{
    void bark(){
        System.out.println("Barking");
    }
}
