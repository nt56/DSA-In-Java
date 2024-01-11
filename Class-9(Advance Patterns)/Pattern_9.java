public class Pattern_9 {

    public static void hollow_rhombus(int n){
        //outer loop number of rows
        for(int i=1; i<=n; i++){
            //for (n-1) spaces
            for(int space=1; space<=(n-i); space++){
                System.out.print(" ");
            }

            //inner loop for how many star want to print with the basis of column
            for(int star=1; star<=n; star++){
                //when Star at boundary then print start else print space
                if(i==1 || i==n || star==1 || star==n){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            //next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollow_rhombus(5);
    }
}
