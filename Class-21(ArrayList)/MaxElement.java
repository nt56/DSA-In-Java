import java.util.ArrayList;

public class MaxElement {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(2);
        arr.add(5);
        arr.add(9);
        arr.add(6);
        arr.add(8);
        System.out.println(arr);

        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.size(); i++){
//            if(arr.get(i) > max){
//                max = arr.get(i);
//            }
            max = Math.max(max,arr.get(i));
        }
        System.out.println("Max ele : " +max);
    }
}
