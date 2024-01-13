public class BinarySearch {

    public static int binarySearch(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = (start+end)/2;

            //comparison
            if(arr[mid] == key){
                return mid;
            }

            //search right side
            if(arr[mid] < key){
                start = mid + 1;
            } else {    //search left side
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14,16,18};
        int key = 12;

        int index = binarySearch(arr,key);

        if(index == -1){
            System.out.println("Not Found");
        } else {
            System.out.println("Found At : "+index);
        }
    }
}
