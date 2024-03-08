import java.util.ArrayList;

public class Question_1 {

    public static boolean monotonic_arraylist(ArrayList<Integer> nums){
        //by default setting true both
        boolean increasing = true;
        boolean decreasing = true;

        //loop for checking increasing order
        for(int i=0; i<nums.size()-1; i++){
            //if 1st ele is found greater than the next ele return false increasing
            if(nums.get(i) > nums.get(i+1)){
                increasing = false;
            }
            //if 1st ele is found smaller than the next ele return false decreasing
            if(nums.get(i) < nums.get(i+1)){
                decreasing = false;
            }
        }

        return increasing || decreasing;    //return any one of them
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(3);
        System.out.println(nums);
        System.out.println(monotonic_arraylist(nums));
    }
}
