import java.util.Scanner;

public class Product {

    public static int multiply(int a, int b){
        return  a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A : ");
        int a = sc.nextInt();
        System.out.print("B : ");
        int b = sc.nextInt();

        int product = multiply(a,b);
        System.out.println(product);
    }
}
