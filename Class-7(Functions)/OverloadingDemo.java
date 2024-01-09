public class OverloadingDemo {

    public static int sub(int a, int b){
        return a - b;
    }

    public static int sub(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(sub(10,20));
        System.out.println(sub(10,20,30));
    }
}
