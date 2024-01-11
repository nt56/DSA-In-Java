public class Pattern_7 {

    public static void butterfly(int n){
        //first half
        for(int i=1; i<=n; i++){
            //print star
            for(int star=1; star<=i; star++){
                System.out.print("*");
            }

            //print space
            for(int space=1; space<=(2*(n-i)); space++){
                System.out.print(" ");
            }

            //print star
            for(int star=1; star<=i; star++){
                System.out.print("*");
            }

            //next line
            System.out.println();
        }

        //second half just reverse the outer for printing mirror image
        for(int i=n; i>=1; i--){
            //print star equal to i
            for(int star=1; star<=i; star++){
                System.out.print("*");
            }

            //print (2*(4-1)) spaces
            for(int space=1; space<=(2*(n-i)); space++){
                System.out.print(" ");
            }

            //print star equal to i
            for(int star=1; star<=i; star++){
                System.out.print("*");
            }

            //next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        butterfly(4);
    }
}
