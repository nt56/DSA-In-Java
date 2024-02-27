public class DivideAndConquer {

    public static void print_array(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void merge_sort(int[] arr, int si, int ei){
        if(si >= ei){
            return;
        }

        int mid = si + (ei-si) / 2;
        merge_sort(arr,si,mid); //left part
        merge_sort(arr,mid+1,ei);   //right part

        merge(arr,si,mid,ei); //function calling or merging
    }

    public static void merge(int[] arr, int si, int mid, int ei){
        int[] temp = new int[ei-si+1];  //temporary array for storing elements
        int i = si;     //iterator for left part
        int j = mid+1;  //iterator for right part
        int k = 0;  //iterator for a temp array

        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //remaining left part array
        while (i <= mid){
            temp[k++] = arr[i++];
        }

        //remaining right part array
        while (j <= ei){
            temp[k++] = arr[j++];
        }

        //copy temp to an original array
        for(k=0 , i=si; k< temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        merge_sort(arr,0,arr.length-1);
        print_array(arr);

    }
}
