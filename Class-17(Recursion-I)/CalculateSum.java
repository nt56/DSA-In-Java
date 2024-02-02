public class CalculateSum {

    public static int sum_of_numbers(int n){
        if(n == 1){
            return 1;
        }

//        int snm1 = sum_of_numbers(n-1);
//        int sum = n + snm1;
//        return sum;

        return n + sum_of_numbers(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum_of_numbers(n));
    }
}
