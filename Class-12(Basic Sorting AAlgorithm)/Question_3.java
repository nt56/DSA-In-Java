public class Question_3 {

    public static void insertion_sort(int[] nums){
        for(int i=1; i< nums.length; i++){
            int current_ele = nums[i];
            int previous_ele = i-1;

            //finding out the correct position after move 1 step ahead the previous element
            while(previous_ele >= 0 && nums[previous_ele] < current_ele){
                nums[previous_ele+1] = nums[previous_ele]; //created space
                previous_ele--;
            }

            //insert
            nums[previous_ele+1] = current_ele;
        }
    }

    public static void print_array(int[] nums){
        for(int i=0; i< nums.length; i++){
            System.out.print(nums[i] +" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {8,6,5,2,1,9,12,45};
        insertion_sort(arr);
        print_array(arr);
    }
}
