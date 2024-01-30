public class ParameterizedConstructor {
    public static void main(String[] args) {
        Student1 s1 = new Student1("nagu",21);
        s1.get();
    }
}

class Student1{
    String name;
    int roll;

    //parametrized constructor
    Student1(String n, int r){
        this.name = n;
        this.roll = r;
        System.out.println("Parametrized Constructor Called");
    }

    void get(){
        System.out.println("Name : " +this.name);
        System.out.println("Roll : " +this.roll);
    }
}