package Arrayys;

public class MaximumSubArray {
    public static void main(String[] args) {
        int arr[]={2,3,-8,7,-1,2,3};

        int max=Integer.MIN_VALUE;
        int currentSum=0;

        for(int i=0;i<arr.length;i++){
            currentSum=currentSum+arr[i];

            max=Math.max(currentSum,max);

            if(currentSum<0){
                currentSum=0;
            }
        }

        System.out.print("Max="+max);
    }
}
