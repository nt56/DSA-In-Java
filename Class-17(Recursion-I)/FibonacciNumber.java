public class FibonacciNumber {

    //calculate nth therm fibonacci number
    public static int fibonacci_number(int n){
        if(n==0 || n==1){
            return n;
        }

//        int fnm1 = fibonacci_number(n-1);
//        int fnm2 = fibonacci_number(n-2);
//        int fib = fnm1 + fnm2;
//        return fib;

        return fibonacci_number(n-1) + fibonacci_number(n-2);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibonacci_number(n));
    }
}
