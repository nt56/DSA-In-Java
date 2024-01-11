public class Pattern_5 {

    public static void binary_triangle(int n){
        //outer loop number of rows
        for(int i=1; i<=n; i++){
            //printing numbers equal to row number
            for(int j=1; j<=i; j++){
                //if sum of i,j is even then print '1' else print '0'
                if((i+j) % 2 == 0){
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            //next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        binary_triangle(5);
    }
}
