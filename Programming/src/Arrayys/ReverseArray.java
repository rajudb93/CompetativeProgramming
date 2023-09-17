package Arrayys;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={10,5,7,30};

        int low=0;
        int high=arr.length-1;

        while(low<high){
            int temp=arr[high];
            arr[high]=arr[low];
            arr[low]=temp;
            low++;
            high--;
        }
       for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
       }
    }
}
