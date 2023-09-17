package Searching;

public class IndexOfFirstOccurancesInSortedArray {
    public static void main(String[] args) {
        int arr[]={5,10,10,20,20,20,20};
        int x=20;

        System.out.print("Index of first occurance in sorted array="+findFirst(arr,0,arr.length-1,x));
    }

    private static int findFirst(int[] arr, int low, int high, int x) {
        if(low>high)
            return -1;
        int mid=(low+high)/2;

        if(x>arr[mid])
            return findFirst(arr,mid+1,high,x);

        if(x<arr[mid])
            return findFirst(arr,low,mid-1,x);
        else{
            if(x==arr[mid] && x!=arr[mid-1])
                return mid;
            else{
                return findFirst(arr,low,mid-1,x);
            }
        }

    }
}
