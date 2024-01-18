public class Question_4 {

    public static void counting_sort(int[] arr){
        //find a max element
        int largest = Integer.MIN_VALUE;
        for(int i=0; i< arr.length; i++){
            largest = Math.max(largest,arr[i]);
        }

        //storing the count of frequency elements in an original array
        int[] count = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        //sorting elements in the new array
        int j=0;
        for(int i=count.length-1; i>=0 ; i--){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void print_array(int[] nums){
        for(int i=0; i< nums.length; i++){
            System.out.print(nums[i] +" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {8,6,5,2,1,9,9,5,2,1,5,7};
        counting_sort(arr);
        print_array(arr);
    }
}
