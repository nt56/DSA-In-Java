import java.util.Scanner;

public class Factorial {

    public static int fact(int num){
        int f = 1;
        for(int i=1; i<=num; i++){
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Num : ");
        int a = sc.nextInt();
        System.out.println(fact(a));
    }
}
