public class IsSortedArray {

    public static boolean is_sorted_array(int[] arr, int i){
        if(i == arr.length-1){
            return true;
        }

        if(arr[i] > arr[i+1]){
            return false;
        }

        return is_sorted_array(arr,i+1);
    }

    public static void main(String[] args) {
//        int[] arr = {1,6,7,5,2};
        int[] arr = {1,2,3,4};
        System.out.println(is_sorted_array(arr,0));
    }
}
