import java.util.Scanner;

public class Searching {

    public static boolean search_in_2d_array(int[][] arr, int key){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == key){
                    System.out.println("Key Found At : (" +i+ "," +j+ ")");
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int n= arr.length;  //number of rows
        int m=arr[0].length;    //total cols in one row

        Scanner sc = new Scanner(System.in);

        //taking elements from user
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //printing the array elements
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //function call
        search_in_2d_array(arr, 5);
    }
}
