public class SortedMatrixSearching {

    public static boolean stair_case_search(int[][] arr, int key){
        int row = 0;
        int col = arr[0].length-1;

        while(row < arr.length-1 && col >= 0){
            //key found
            if(arr[row][col] == key){
                System.out.println("Key Found At : (" +row+ "," +col+ ")");
                return true;
            }

            //left
            else if (key < arr[row][col]) {
                col--;
            }

            //bottom
            else {
                row++;
            }
        }

        System.out.println("Key not found");
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}
        };
        int key = 35;
        stair_case_search(matrix,key);
    }
}
