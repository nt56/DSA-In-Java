public class Update {

    public static int set_Ith_bit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static int clear_Ith_bit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int update_Ith_bit(int n, int i, int newBit){
        if(newBit == 0){
            return set_Ith_bit(n,i);
        } else {
            return clear_Ith_bit(n,i);
        }
    }

    public static void main(String[] args) {
        System.out.println(update_Ith_bit(10,1,0));
    }
}
