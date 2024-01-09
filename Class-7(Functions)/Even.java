import java.util.Scanner;

public class Even {

    public static boolean isEven(int num){
        return num % 2 == 0;

//        if(num % 2 == 0)
//            return true;
//        else
//            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Num : ");
        int n = sc.nextInt();

        if(isEven(n)){
            System.out.println(n+ " is even");
        } else {
            System.out.println(n+ " is odd");
        }

    }
}
