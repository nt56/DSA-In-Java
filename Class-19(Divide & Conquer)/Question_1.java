import java.util.Arrays;

public class Question_1 {

    public static void mergeSort(String[] arr, int si, int ei){
        if(si >= ei){
            return;
        }

        int mid = si + (ei-si) / 2;

        mergeSort(arr,si,mid);  //left part
        mergeSort(arr,mid+1,ei);    //right part
        merge(arr,si,mid,ei);   //merging the elements
    }

    public static void merge(String[] arr, int si, int mid, int ei){
        String[] temp = new String[ei-si+1];
        int p1 = si;    //point to the left part array at first index
        int p2 = mid+1; ////point to the right part array at first index
        int p3 = 0; //point to temp array 0th index

        //this loop sorts the array
        while(p1 <= mid && p2 <= ei){
            if(arr[p1].compareTo(arr[p2]) <= 0){ //storing smaller and equal elements
                temp[p3] = arr[p1];
                p1++;
                p3++;
            } else {        //storing greater elements
                temp[p3] = arr[p2];
                p2++;
                p3++;
            }
        }

        //for remaining left part array element storing
        while (p1 <= mid){
            temp[p3++] = arr[p1++];
        }

        //for remaining right part array element storing
        while (p2 <= ei){
            temp[p3++] = arr[p2++];
        }

        //storing temp array elements to original array elements position
        for(int i=0; i< temp.length; i++){
            arr[i+si] = temp[i];
        }
    }

    public static void main(String[] args) {
        String[] arr = { "sun", "earth", "mars", "mercury" };
        mergeSort(arr,0,arr.length-1);
        System.out.print(Arrays.toString(arr));
    }
}
