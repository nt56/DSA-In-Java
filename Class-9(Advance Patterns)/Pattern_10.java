public class Pattern_10 {

    public static void diamond(int n){
        //first half
        for(int i=1; i<=n; i++){
            //(n-i) spaces
            for(int space=1; space<=(n-i); space++){
                System.out.print(" ");
            }

            //stars
            for(int star=1; star<=(2*i-1); star++){
                System.out.print("*");
            }

            //next line
            System.out.println();
        }

        //second half
        for(int i=n; i>=1; i--){
            //(n-i) spaces
            for(int space=1; space<=(n-i); space++){
                System.out.print(" ");
            }

            //stars
            for(int star=1; star<=(2*i-1); star++){
                System.out.print("*");
            }

            //next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        diamond(4);
    }
}
