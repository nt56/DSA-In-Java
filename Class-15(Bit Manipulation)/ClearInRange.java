public class ClearInRange {

    public static int clear_bits_in_range(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clear_bits_in_range(10,2,4));
    }
}
