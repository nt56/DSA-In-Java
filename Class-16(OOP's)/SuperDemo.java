public class SuperDemo {
    public static void main(String[] args) {
        NewHorse h = new NewHorse();
    }
}

class NewAnimal {
    NewAnimal(){
        System.out.println("New Animal Constructor Called");
    }
}

class NewHorse extends NewAnimal{
    NewHorse(){
        super();
        System.out.println("New Horse Constructor Called");
    }
}
