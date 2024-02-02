public class PrintIncrement {

    public static void print_increment(int n){
        if(n==1){
            System.out.print(n +" ");
            return;
        }

        print_increment(n-1);
        System.out.print(n +" ");
    }

    public static void main(String[] args) {
        int n=10;
        print_increment(n);
    }
}
