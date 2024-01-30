public class DefaultConstructor {
    public static void main(String[] args) {
        Student s = new Student();
    }
}

class Student{
    String name;
    int roll;

    //default constructor
    Student(){
        System.out.println("Default Constructor called");
    }
}
