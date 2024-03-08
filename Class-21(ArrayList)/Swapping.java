import java.util.ArrayList;

public class Swapping {
    public static void swap(ArrayList<Integer> arr, int idx1, int idx2){
        int temp = arr.get(idx1);
        arr.set(idx1, arr.get(idx2));
        arr.set(idx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(5);
        arr.add(9);
        arr.add(6);
        arr.add(8);
        System.out.println(arr);

        swap(arr,1,3);
        System.out.println(arr);
    }
}
