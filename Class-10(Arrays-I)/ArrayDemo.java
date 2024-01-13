import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] numbers = new int[20];    //declaration

        Scanner sc = new Scanner(System.in);

        //input
        numbers[0] = sc.nextInt();
        numbers[1] = sc.nextInt();
        numbers[2] = sc.nextInt();
        numbers[3] = sc.nextInt();

        //output
        System.out.println("num-1 : " +numbers[0]);
        System.out.println("num-1 : " +numbers[1]);
        System.out.println("num-1 : " +numbers[2]);
        System.out.println("num-1 : " +numbers[3]);

        int avg = numbers[0] + numbers[1] + numbers[2] + numbers[3]/4;
        System.out.println("Average : " +avg);

    }
}
