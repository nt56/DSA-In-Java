public class SubArrays {

    public static void printSubArrays(int[] arr){
        int totalSubarrays = 0;
        //storing start number i
        for(int i=0; i< arr.length; i++){
            //start = i
            //storing last number j and including start number i
            for(int j=i; j<arr.length; j++){
                //end = j
                //printing values from range start to last number i.e. i to j
                for(int k=i; k<=j; k++){
//                    for(int k=start; k<=end; k++)
                    System.out.print(arr[k] + " ");
                }
                totalSubarrays++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total sub Arrays : " +totalSubarrays);
    }

    public static void main(String[] args) {
        int[] arr = {10,11,12,13,14,15};
        printSubArrays(arr);
    }
}
