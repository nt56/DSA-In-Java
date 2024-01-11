public class Pattern_8 {

    public static void solid_rhombus(int n){
        //outer loop number of rows
        for(int i=1; i<=n; i++){
            //for (n-1) spaces
            for(int space=1; space<=(n-i); space++){
                System.out.print(" ");
            }

            //for n stars
            for(int star=1; star<=n; star++){
                System.out.print("*");
            }

            //next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solid_rhombus(5);
    }
}
