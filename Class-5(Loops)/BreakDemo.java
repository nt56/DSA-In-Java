import java.util.Scanner;

public class BreakDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {

            System.out.print("Enter Number : ");
            int n = sc.nextInt();

            if(n % 10 == 0){
                break;
            }

            System.out.print("Number :" +n);

        } while(true);

    }
}
