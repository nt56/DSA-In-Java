import java.util.Scanner;

public class Swapping {

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " +a+" b = " +b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A : ");
        int a = sc.nextInt();
        System.out.print("B : ");
        int b = sc.nextInt();
        swap(a,b);
    }
}
