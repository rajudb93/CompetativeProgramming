package Searching;

public class BinarySearchUsingIterative {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80};
        int x=50;

        System.out.print("Searched element index is="+searchedIndex(arr,x));

    }

    private static int searchedIndex(int[] arr, int x) {
        int low=0;
        int high=arr.length-1;
        int mid=0;

        while(low<high){
            mid=(low+high)/2;

            if(arr[mid]==x){
                return mid;
            }
            if(arr[mid]<x){
                low++;
            }
            else{
                high--;
            }
        }
        return -1;
    }
}
