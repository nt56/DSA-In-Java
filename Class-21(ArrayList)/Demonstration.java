import java.util.ArrayList;

public class Demonstration {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        //adding elements
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(arr);

        //setting the element at particular index
        arr.set(2,33);
        arr.set(3,44);
        System.out.println(arr);

        //getting the element
        int ele_1 = arr.get(3);
        int ele_2 = arr.get(2);
        System.out.print(ele_1 +" "+ ele_2);
        System.out.println();

        //removing element
        arr.remove(2);
        System.out.println(arr);

        //contains
        System.out.println(arr.contains(1));
        System.out.println(arr.contains(33));

        //size
        System.out.println(arr.size());
    }
}
