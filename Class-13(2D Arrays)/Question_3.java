public class Question_3 {

    public static void print_matrix(int[][] matrix){
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int row = 2, column = 3;
        int[][] matrix = { {2, 3, 7}, {5, 6, 7} };

        print_matrix(matrix);

        int[][] transpose = new int[column][row];
        for(int i=0; i< row; i++){
            for(int j=0; j<column; j++){
                transpose[j][i] = matrix[i][j];
            }
            System.out.println();
        }

        print_matrix(transpose);
    }
}
