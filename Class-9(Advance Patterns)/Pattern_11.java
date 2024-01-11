public class Pattern_11 {

    public static void number_pyramid(int n){
        int count = 1;
        for(int i=1; i<=n; i++){
            //for space
            for(int space=1; space<=(n-i); space++){
                System.out.print(" ");
            }

            //for numbers

            for(int num=1; num<=i; num++){
                System.out.print(count +" ");
            }
            count++;

            //next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        number_pyramid(5);
    }
}
