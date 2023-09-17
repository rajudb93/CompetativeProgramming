package Searching;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80};
        int x=50;

        System.out.print("Searched element index is="+searchedIndex(arr,x,0,arr.length-1));
    }

    private static int searchedIndex(int[] arr, int x,int low,int high) {
        int mid=0;


        mid=(low+high)/2;

        if(arr[mid]==x)
            return mid;
        if(arr[mid]<x)
            return searchedIndex(arr,x,low+1,high);
        if(arr[mid]>x)
            return searchedIndex(arr,x,low,high-1);

        return -1;
    }
}
