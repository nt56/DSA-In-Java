import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Num : ");
        int a = sc.nextInt();

        if(isPalindrome(a)){
            System.out.println(a+ " is Palindrome");
        } else{
            System.out.println(a+ " is not Palindrome");
        }

    }

    public static boolean isPalindrome(int num){
        int n = num;
        int rev = 0;

        while(num != 0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        return rev == n;
    }
}
