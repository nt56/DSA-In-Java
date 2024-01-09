import java.util.Scanner;

public class SumOfDigits {

    public static int sumOfDigits(int num){
        int sum = 0;

        while(num > 0){
            int ld = num % 10;
            sum = sum + ld;
            num = num / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Num : ");
        int a = sc.nextInt();

        System.out.println("Sum Of Digits : " +sumOfDigits(a));
    }
}
