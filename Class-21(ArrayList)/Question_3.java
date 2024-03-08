import java.util.ArrayList;

public class Question_3 {

    public static int maximum_count(ArrayList<Integer> nums, int key){
        int[] temp_nums = new int[1001];    //temp array for storing frequency count

        //iterate loop till 2nd last element
        for(int i=0; i< nums.size()-1; i++){
            if(nums.get(i) == key){
                temp_nums[nums.get(i+1)]++;
            }
        }

        int target = 0; //returning maximum count element
        int maxElement = 0; //storing a max element while iterating

        //iterating in temp array
        for(int i=0; i<temp_nums.length; i++){
            if(temp_nums[i] > maxElement){  //compares every frequency occurrence and returns max frequency occurrence
                target = i; //storing index means particular element
                maxElement = temp_nums[i];
            }
        }

        return target;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(3);
        int key = 2;
        System.out.println(nums);
        System.out.println(maximum_count(nums,key));
    }
}
