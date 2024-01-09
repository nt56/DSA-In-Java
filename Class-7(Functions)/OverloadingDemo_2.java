public class OverloadingDemo_2 {

    public static int add(int a, int b){
        return a+b;
    }

    public static float add(float a, float b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(add(10,20));
        System.out.println(add(5.6f,8.6f));
    }
}
