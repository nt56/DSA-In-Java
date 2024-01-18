// import java.util.*;

// public class Question_5 {

//     public List<List<Integer>> threeSum(int[] num){
//         List<List<Integer>> result = new ArrayList <List<Integer>> ();

//         for(int i=0; i< num.length; i++){
//             for(int j=i+1; j< num.length; j++){
//                 for(int k=j+1; k< num.length; k++){
//                     if(num[i] + num[j] + num[k] == 0){
//                         List<Integer> triplet = new ArrayList <Integer> ();
//                         triplet.add(num[i]);
//                         triplet.add(num[j]);
//                         triplet.add(num[k]);
//                         Collections.sort(triplet);
//                         result.add(triplet);
//                     }
//                 }
//             }
//         }

//         result = new ArrayList<List<Integer>> (new LinkedHashSet<List<Integer>> (result));
//         return result;
//     }

//     public static void main(String[] args) {
//         int[] num = {-1,0,1,2,-1,-4};

//     }
// }


public class Question_5 {

    public static void threeSum(int[] num){
        for(int i=0; i< num.length; i++){
            for(int j=i+1; j< num.length; j++){
                for(int k=j+1; k< num.length; k++){
                    if(num[i] + num[j] + num[k] == 0){
                        System.out.println(num[i] + ", " + num[j] + ", " + num[k]);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] num = {-1,0,1,2,-1,-4};
        threeSum(num);
    }
}
