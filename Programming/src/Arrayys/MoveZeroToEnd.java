package Arrayys;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int arr[]={8,5,0,10,0,20};
        int  count=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                swap(arr,i,count);
                count++;
            }
        }

        for(int p=0;p<arr.length;p++){
            System.out.println(arr[p]);
        }
    }

    private static void swap(int arr[],int i, int count) {
        int temp=arr[i];
        arr[i]=arr[count];
        arr[count]=temp;
    }
}
