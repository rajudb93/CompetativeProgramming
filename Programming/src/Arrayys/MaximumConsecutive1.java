package Arrayys;

public class MaximumConsecutive1 {
    public static void main(String[] args) {
        int arr[]={1,0,1,1,1,1,0,1,1};
        int counter=0;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                counter++;
            }
            else{
                counter=0;
            }
            max=Math.max(counter,max);

        }
        System.out.print("Max="+max);
    }
}
