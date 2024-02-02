public class PrintDecrement {

    public static void print_decrement(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }

        System.out.print(n +" ");
        print_decrement(n-1);
    }

    public static void main(String[] args) {
        int n = 10;
        print_decrement(n);
    }
}
