public class Question_2 {

    public static int inverted_arr_search(int[] nums, int target){
        //min(pivot) will have index of minimum elements of nums
        int min = minSearch(nums);

        //find in sorted left
        if(nums[min] <= target && target <= nums[nums.length-1]){
            return search(nums,min, nums.length-1,target);
        }
        //find in sorted right
        else{
            return search(nums,0,min,target);
        }
    }

    //normal binary search to find target in a left to right boundary
    public static int search(int[] nums, int left, int right, int target){
        int l = left;
        int r = right;

        while(l <= r){
            int mid = l + (r-l)/2;

            if(nums[mid] == target){
                return mid;
            }
            else if(target < nums[mid]){
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }

        return -1;
    }


    //finding pivot index or smallest element index
    public static int minSearch(int[] nums){
        int left = 0;
        int right = nums.length-1;

        while(left < right){
            int mid = left + (right-left)/2;

            if(mid > 0 && nums[mid-1] > nums[mid]){
                return mid;
            }
            //at left part
            else if(nums[left] <= nums[mid] && nums[mid] > nums[right]){
                left = mid + 1;
            }
            //at right part
            else {
                right = mid - 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,1,2,3};
        System.out.println(inverted_arr_search(arr,7));
    }
}
