public class Pattern_4 {

    public static void floyds_triangle(int n){
        int count = 1;
        //outer loop number of rows
        for(int i=1; i<=n; i++){
            //inner loop for printing numbers
            for(int j=1; j<=i; j++){
                System.out.print(count +" ");
                count++;
            }
            //next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        floyds_triangle(5);
    }
}
