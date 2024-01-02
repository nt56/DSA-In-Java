import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number-1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter number-2 : ");
        int n2 = sc.nextInt();

        System.out.print("Enter Operator : ");
        char op = sc.next().charAt(0);

        switch (op){
            case '+':
                System.out.println(n1+n2);
                break;

            case '-':
                System.out.println(n1-n2);
                break;

            case '*':
                System.out.println(n1*n2);
                break;

            case '/':
                System.out.println(n1/n2);
                break;

            case '%':
                System.out.println(n1%n2);
                break;

            default:
                System.out.println("Wrong Input");

        }
    }
}
