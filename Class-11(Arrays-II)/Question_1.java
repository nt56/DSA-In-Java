import java.util.HashSet;

public class Question_1 {

    //brute force O(n^2)
//    public static boolean containDuplicate(int[] nums){
//        for(int i=0; i< nums.length; i++){
//            for(int j=i+1; j< nums.length; j++){
//                if(nums[i] == nums[j]){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

        //Using Sets O(n)
    public static boolean containDuplicate(int[] nums){
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0; i< nums.length; i++){
            if(hs.contains(nums[i])){
                return true;
            } else {
                hs.add(nums[i]);
            }
        }

        return false;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containDuplicate(nums));
    }
}
