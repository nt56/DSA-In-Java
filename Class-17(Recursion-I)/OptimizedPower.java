public class OptimizedPower {

    public static int optimized_power(int a, int n){
        if(n==0){
            return 1;
        }

        int halfPower = optimized_power(a, n/2);
        int halfPowerSquare = halfPower * halfPower;

        //n is odd
        if(n % 2 != 0){
            halfPowerSquare = a * halfPowerSquare;
        }

        return halfPowerSquare;
    }

    public static void main(String[] args) {
        System.out.println(optimized_power(2,10));
    }
}
//O(logn)
