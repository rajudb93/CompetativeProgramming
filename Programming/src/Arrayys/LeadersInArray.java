package Arrayys;

public class LeadersInArray {
    public static void main(String[] args) {
        int arr[]={7,10,4,3,13,5,2};

        System.out.print(arr[arr.length-1]+" ");
        int temp=arr[arr.length-1];

        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>temp){
                System.out.print(arr[i]+" ");
                temp=arr[i];
            }
        }
    }
}
