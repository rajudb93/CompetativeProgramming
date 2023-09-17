package Arrayys;

public class FindMaxCircularSubArray {
    public static void main(String[] args) {
        int arr[]={5,-2,3,4};
        int n=arr.length;

        int max_sum=Integer.MIN_VALUE;
        int curr_sum=0;

        for(int i=0;i<n;i++){
            curr_sum=arr[i];
            for(int j=1;j<n;j++){
                int ind=(i+j)%n;

                curr_sum=curr_sum+arr[ind];
                max_sum=Math.max(curr_sum,max_sum);

                if(curr_sum<0)
                    curr_sum=0;

            }
        }

        System.out.print(max_sum);
    }
}
