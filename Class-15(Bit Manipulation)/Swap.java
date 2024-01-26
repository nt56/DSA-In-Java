public class Swap {
    public static void main(String[] args) {
        int x=3;
        int y=5;

        System.out.println("Before Swapping : x= "+x+ " y= " +y);

        //swapping
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println("After Swapping : x= "+x+ " y= " +y);
    }
}
//Q-2 --> Swap two numbers without using any third variable.
