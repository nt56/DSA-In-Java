import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("square : ");
        int s = sc.nextInt();

        int area = s * s;
        System.out.println("Area Of square : " +area);
    }
}
