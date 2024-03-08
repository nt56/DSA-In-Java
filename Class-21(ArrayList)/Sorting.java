import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(5);
        arr.add(9);
        arr.add(6);
        arr.add(8);
        System.out.println(arr);

        Collections.sort(arr);  //ascending order
        System.out.println(arr);

//        Collections.sort(arr, Collections.reverseOrder());  //descending order
//        System.out.println(arr);

        arr.sort(Collections.reverseOrder());  //descending order
        System.out.println(arr);
    }
}

