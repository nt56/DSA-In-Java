public class MaxSubArraySum_1 {

    public static void maxSubArray(int[] numbers){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i< numbers.length; i++){
            for(int j=i; j< numbers.length; j++){
                currSum = 0;
                for(int k=i; k<=j; k++){
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Maximum Sub Array Sum is : " +maxSum);
    }

    public static void main(String[] args) {
        int[] numbers = {10,11,12,13,14,15};
        maxSubArray(numbers);
    }
}
//Using Brute Force