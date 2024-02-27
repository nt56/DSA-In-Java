public class Question_2 {

    public static int majority_element(int[] nums){
        //assuming the winner is 0th index ele and lead is 1
        int winner = nums[0];
        int lead = 1;

        //starting from 1th index
        for(int i=1; i< nums.length; i++){
            if(nums[i] == winner){
                lead++;
            }
            else if(lead > 0 ){ //if found new ele then dec the lead of the winner until lead becomes equal or zero
                lead--;
            }
            else{   //if found a new element after equal of lead the assign new winner and lead
                winner = nums[1];
                lead = 1;
            }
        }

        return winner;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println("Winner is : " +majority_element(nums));
    }
}
