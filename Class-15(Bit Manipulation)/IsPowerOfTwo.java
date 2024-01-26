public class IsPowerOfTwo {

    public static boolean is_power_of_two(int n){
        return (n & (n-1)) == 0;
    }
    //current n and previous n AND of LSB = 0 then true else false

    public static void main(String[] args) {
        System.out.println(is_power_of_two(7));
    }
}
