public class SectionSort {

    public static void selection_sort(int[] nums){
        for(int i=0; i< nums.length-1; i++){
            int min_pos = i;
            //below loop apply for unsorted part
            for(int j=i+1; j< nums.length; j++){   //(5-0)
                if(nums[min_pos] > nums[j]){
                    min_pos = j;
                }
            }
            //swpa
            int temp = nums[min_pos];
            nums[min_pos] = nums[i];
            nums[i] = temp;
        }
    }

    public static void print_array(int[] nums){
        for(int i=0; i< nums.length; i++){
            System.out.print(nums[i] +" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {8,6,5,2,1,9};
        selection_sort(arr);
        print_array(arr);
    }

}
