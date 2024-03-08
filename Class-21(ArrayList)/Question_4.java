import java.util.ArrayList;

public class Question_4 {

    public static ArrayList<Integer> beutiful_arraylist(int n){

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);    //adding 1 in an array because start with 1 to till n

        while (ans.size() < n){
            //creating temp arraylist for adding elements
            ArrayList<Integer> temp = new ArrayList<>();

            int ans_size = ans.size();

            //iterating loop for getting odd numbers till size of ans
            for(int i=0; i<ans_size; i++){
                if((ans.get(i)*2-1) <= n){  //for odd 2*i-1
                    temp.add(ans.get(i)*2-1);   //adding ele in temp
                }
            }

            //iterating loop for getting even numbers till size of ans
            for(int i=0; i<ans_size; i++){
                if((ans.get(i)*2) <= n){  //for even 2*i and less than size
                    temp.add(ans.get(i)*2); //adding ele in temp
                }
            }

            //adding temp arraylist into ans arraylist
            ans = temp;
        }

        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(beutiful_arraylist(n));
    }
}
