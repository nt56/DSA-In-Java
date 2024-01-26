public class Set {

    public static int set_Ith_bit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static void main(String[] args) {
        System.out.println(set_Ith_bit(10,2));
    }
}
