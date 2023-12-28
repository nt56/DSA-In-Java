import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number-1 : ");
        int a = sc.nextInt();
        System.out.print("Number-2 : ");
        int b = sc.nextInt();

        int sum = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;

        System.out.println("Addition : " +sum);
        System.out.println("Subtraction : " +sub);
        System.out.println("Product : " +mul);
        System.out.println("Division : " +div);
    }
}
