public class Clear {

    public static int clear_Ith_bit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clear_Ith_bit(10,1));
    }
}
