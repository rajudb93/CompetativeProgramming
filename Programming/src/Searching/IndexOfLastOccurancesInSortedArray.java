package Searching;

public class IndexOfLastOccurancesInSortedArray {
    public static void main(String[] args) {
        //int arr[]={5,10,10,20,20,20,20};
        int arr[]={5,10,10,30,30,30,30};
        int x=5;

        System.out.print("Index of last  occurance in sorted array="+findLastOccurance(arr,0,arr.length-1,x));
    }

    private static int findLastOccurance(int[] arr, int low, int high, int x) {
        if(low>high)
            return -1;
        int mid=(low+high)/2;

        if(x>arr[mid])
            return findLastOccurance(arr,mid+1,high,x);

        if(x<arr[mid])
            return findLastOccurance(arr,low,mid-1,x);
        else{
            if(x!=arr[mid+1] || mid==arr.length-1)
                return mid;
            else{
                return findLastOccurance(arr,mid+1,high,x);
            }
        }

    }
}
