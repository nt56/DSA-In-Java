public class ClearBit {

    public static int clear_I_bits(int n, int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clear_I_bits(15,2));
    }
}
