package Arrayys;

public class LargestElementInArray {
    public static void main(String[] args) {
        int arr[]={5,8,20,10};

        int lar=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>lar){
                lar=arr[i];
            }
        }
        System.out.println(lar);
    }
}
