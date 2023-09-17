package Arrayys;

public class SlidingWindowTechnique {
    public static void main(String[] args) {
        int arr[]={1,8,30,-5,20,7};
        int k=4;
        int sum=0;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        max=Math.max(max,sum);

        for(int j=k;j<arr.length;j++){
            sum=sum-arr[j-k]+arr[j];
            max=Math.max(max,sum);
        }

        System.out.print("Max="+max);
    }
}
