public class LargestAndSmallest {

    public static void largestAndSmallest(int[] arr){
        int largest = Integer.MIN_VALUE;    //-infinity
        int smallest = Integer.MAX_VALUE;   //+infinity

        for(int i=0; i< arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }

            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }

//        for (int j : arr) {
//            if (largest < j) {
//                largest = j;
//            }
//
//            if (smallest > j) {
//                smallest = j;
//            }
//        }

        System.out.println("Largest : " +largest);
        System.out.println("Smallest : " +smallest);
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90};
        largestAndSmallest(arr);
    }
}
