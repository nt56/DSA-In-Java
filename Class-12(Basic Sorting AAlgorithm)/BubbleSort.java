public class BubbleSort {

    public static void bubble_sort(int[] nums){
        for(int turn=0; turn< nums.length-1; turn++){
            for(int j=0; j< nums.length-1-turn; j++){   //(5-0)
                if(nums[j] > nums[j+1]){
                    //swap
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }

    public static void print_array(int[] nums){
        for(int i=0; i< nums.length; i++){
            System.out.print(nums[i] +" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {8,6,5,2,1,9};
        bubble_sort(arr);
        print_array(arr);
    }

}
