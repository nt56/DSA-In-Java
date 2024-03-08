import java.util.ArrayList;
import java.util.Collections;

public class Question_2 {

    public static ArrayList<Integer> lonely_numbers(ArrayList<Integer> nums){
        //sorting arraylist for easy to iterate
        Collections.sort(nums);

        //arraylist for storing and returning the lists
        ArrayList<Integer> ans = new ArrayList<>();

        //iterating through a nums array
        for(int i=0; i<nums.size(); i++){
            //if the current ele is equal to a previous element or is ele-1 is equal to previous ele then skip
            if(i!=0 && ((nums.get(i)-1) == nums.get(i-1) || nums.get(i) == nums.get(i-1)) ){
                continue;
            }

            //if the current ele is equal to next element or is ele+1 is equal to next ele, then skip
            if(i!=nums.size()-1 && (nums.get(i)+1 == nums.get(i+1) || nums.get(i) == nums.get(i+1)) ){
                continue;
            }

            //add ele in temp array
            ans.add(nums.get(i));
        }

        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(5);
        nums.add(3);
        System.out.println(nums);
        System.out.println(lonely_numbers(nums));
    }
}
