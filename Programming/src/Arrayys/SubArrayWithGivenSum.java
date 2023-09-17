package Arrayys;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int arr[]={4,8,12,5};
        int sum=17;
        int currentSum=0;
        int s=0;
        int flag=0;

        for(int i=0;i<arr.length;i++){
            currentSum=currentSum+arr[i];

            while(currentSum>sum){
                currentSum=currentSum-arr[s];
                s++;

            }
            if(currentSum==sum){
                System.out.print("yes");
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.print("no");
        }
    }
}
