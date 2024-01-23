public class DiagonalSum {

    public static int print_diagonal_sum(int[][] arr){
        int sum = 0;    //sum of both diagonals
        for(int i=0; i< arr.length; i++){
            //sum for primary diagonal
            sum += arr[i][i];

            //sum for secondary diagonal
            if(i != arr.length-1) {
                sum += arr[i][arr.length - i - 1];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        int sum = print_diagonal_sum(arr);
        System.out.println("Sum Of PD and SD is : " +sum);
    }
}

//for brute force, check out the screenshot