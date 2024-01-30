public class CopyConstructor {
    public static void main(String[] args) {
        int[] arr = {10,20,30};
        Student2 s2 = new Student2("abc",10,arr);
        s2.get();
        System.out.println();

        Student2 s2cp = new Student2(s2);
        s2.marks[1] = 40;
        s2cp.get();
    }
}

class Student2{
    String name;
    int roll;
    int[] marks;

    //parametrized constructor
    Student2(String n, int r, int[] m){
        this.name = n;
        this.roll = r;
        this.marks = m;
        System.out.println("Parametrized Constructor Called");
    }

    //deep copy constructor --> no change effect
    Student2(Student2 s2){
        System.out.println("Copy Constructor Called");
        this.name = s2.name;
        this.roll = s2.roll;
        marks = new int[3];
        for(int i=0; i< marks.length; i++){
            this.marks[i] = s2.marks[i];
        }
    }

    void get(){
        System.out.println("Name : " +this.name);
        System.out.println("Roll : " +this.roll);
        for (int i=0; i<3; i++){
            System.out.println(marks[i]);
        }
    }
}
