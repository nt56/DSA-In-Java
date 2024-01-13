public class Pairs {

    public static void printPairs(int[] arr){
        int totalPairs = 0;
        for(int i=0; i<arr.length; i++){    //10,11,12,13,14,15
            for(int j=i+1; j< arr.length; j++){     //11,12,13,14,15
                System.out.print("( " +arr[i]+ "," +arr[j]+ " )");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs : "+totalPairs);
    }

    public static void main(String[] args) {
        int[] arr = {10,11,12,13,14,15};
        printPairs(arr);
    }
}
