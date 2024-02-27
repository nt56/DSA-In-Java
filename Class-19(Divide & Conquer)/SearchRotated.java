public class SearchRotated {

    public static int search(int[] arr, int tar, int si, int ei){
        //base case
        if(si > ei){
            return -1;
        }

        //kaam
        int mid = si + (ei-si) / 2;

        //case found
        if(arr[mid] == tar){
            return mid;
        }

        //mid-on line-1
        if(arr[si] <= arr[mid]){
            //case-1 --> left
            if (arr[si] <= tar && tar <= arr[mid]){
                return search(arr,tar,si,mid-1);
            } else {    //case-2 --> right
                return search(arr,tar,mid+1,ei);
            }
        }

        //mid-on line-2
        else {
            //case-1 --> right
            if(arr[mid] <= tar && tar <= arr[ei]){
                return search(arr,tar,mid+1,ei);
            }  else {   //case-4 --> left
                return search(arr,tar,si,mid-1);
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        int target_index = search(arr,target,0,arr.length-1);
        System.out.println(target_index);
    }
}
