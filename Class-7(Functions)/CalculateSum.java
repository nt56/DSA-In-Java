import java.util.Scanner;

public class CalculateSum {

    public static int sum(int a,int b){     //parameters or formal parameters
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A : ");
        int a = sc.nextInt();
        System.out.print("B : ");
        int b = sc.nextInt();
        int result = sum(a,b);      //arguments or actual parameters
        System.out.println(result);
    }
}
