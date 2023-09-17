package Searching;

public class BinarySearchInSortedAndRotatedArray {
    public static void main(String[] args) {
        int arr[]={10,20,40,60,5,8};
        int x=60;
        
        System.out.print("Searched Element Index is="+findIndex(arr,0,arr.length-1,x));
    }

    private static int findIndex(int[] arr, int low, int high, int x) {

        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==x)
                return mid;

            if(arr[low]<arr[mid]){
                if(x>=arr[low] && x<arr[mid])
                    high=mid-1;
                else
                    low=mid+1;
            }
            else{
                if(x>arr[mid] && x<=arr[high])
                    low=mid+1;
                else
                    high=mid-1;
            }
        }
        return -1;
    }
}
