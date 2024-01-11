public class Pattern_1 {

    public static void hollowRectangle(int r, int c){
        //outer loop number of rows
        for(int i=1; i<=r; i++){
            //inner loop for how many star want to print with the basis of column
            for(int j=1; j<=c; j++){
                //when Star at boundary then print start else print space
                if(i==1 || i==r || j==1 || j==c){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            //for next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowRectangle(5,6);
    }
}

//Hollow Rectangle
