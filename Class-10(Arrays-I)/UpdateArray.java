public class UpdateArray {

    public static void update(int[] arr){
        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i] + 1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {97, 98, 99};
        update(arr);

        //print numbers
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }
}
