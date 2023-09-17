package Arrayys;

public class SecondLargestElementInArray {
    public static void main(String[] args) {
        int arr[]={5,8,20,10};

        int lar=Integer.MIN_VALUE;
        int sLar=Integer.MIN_VALUE;;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>lar){
                sLar=lar;
                lar=arr[i];
            }
            if(arr[i]>sLar && arr[i]<lar){
                sLar=arr[i];
            }
        }
        System.out.println("Larges="+lar+" Second Largest="+sLar);
    }
}
