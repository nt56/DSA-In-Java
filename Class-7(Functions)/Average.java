import java.util.Scanner;

public class Average {

    public static double avg(double a, double b, double c){
        return (a+b+c)/3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Num1 : ");
        double n1 = sc.nextInt();
        System.out.print("Enter Num2 : ");
        double n2 = sc.nextInt();
        System.out.print("Enter Num3 : ");
        double n3 = sc.nextInt();

        double ans = avg(n1,n2,n3);
        System.out.println("Average : " +ans);
    }
}
