import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int n = sc.nextInt();

        int rev = 0;

        while(n != 0){
            int rem = n % 10;   //returns last digit
            rev = (rev * 10) + rem;     //formula for appending last digit at start
            n = n / 10;         //removes last digit
        }

        System.out.println(rev);
    }
}
