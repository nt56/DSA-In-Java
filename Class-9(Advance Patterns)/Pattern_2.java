public class Pattern_2 {

    public static void inverted_rotated_half_pyramid(int n){
        //outer loop number of rows
        for(int i=1; i<=n; i++){
            //for spaces
            for(int space=1; space<=(n-i); space++){
                System.out.print(" ");
            }

            //for stars
            for(int star=1; star<=i; star++){
                System.out.print("*");
            }

            //for next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        inverted_rotated_half_pyramid(5);
    }
}
