public class StaticDemo {
    public static void main(String[] args) {
        Student5 s5 = new Student5();
        s5.schoolName = "ABCD";

        Student5 s6 = new Student5();
        System.out.println(s6.schoolName);

        Student5 s7 = new Student5();
        s7.schoolName = "PQRS";

        Student5 s8 = new Student5();
        System.out.println(s8.schoolName);
    }
}

class Student5{
    String name;
    int roll;

    static String schoolName;

    void setName(String newName){
        this.name = newName;
    }

    String getName(){
        return this.name;
    }
}
