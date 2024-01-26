public class EvenOdd {

    public static void even_odd(int n){
        int bitMask = 1;

        if((n&bitMask) == 0){
            System.out.println("Even ");
        } else {
            System.out.println("Odd ");
        }
    }

    public static void main(String[] args) {
        even_odd(10);
        even_odd(11);
        even_odd(12);
    }
}
