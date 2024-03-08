import java.util.ArrayList;

public class PairSum1 {
    //brute force approach --> O(n2)
//    public static boolean pair_sum_1(ArrayList<Integer> list, int target){
//        for(int i=0; i< list.size(); i++){
//            for(int j=i+1; j< list.size(); j++){
//                if((list.get(i) + list.get(j)) == target){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    //optimized approach --> O(n) --> two pointer
    public static boolean pair_sum_1(ArrayList<Integer> list, int target){
        int lp = 0;
        int rp = list.size()-1;

        while(lp != rp){
            //case1
            if((list.get(lp) + list.get(rp)) == target){
                return true;
            }

            //case2
            if((list.get(lp) + list.get(rp)) < target){
                lp++;   //less than target
            } else {
                rp--;   //more than target
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        System.out.println(pair_sum_1(list,target));
    }
}
