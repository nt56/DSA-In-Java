import java.util.Scanner;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int evenSum = 0;
        int oddSum = 0;
        int ch;

        do {
            System.out.print("Enter Number : ");
            num = sc.nextInt();

            if(num % 2 == 0){
                evenSum += num;
            } else {
                oddSum += num;
            }

            System.out.println("Do you want to continue? Press 1 for yes or 0 for no : ");
            ch = sc.nextInt();

        } while(ch == 1);

        System.out.println("Even Numbers : " +evenSum);
        System.out.println("Odd Numbers : " +oddSum);
    }
}
