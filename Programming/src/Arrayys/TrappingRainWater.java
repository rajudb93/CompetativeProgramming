package Arrayys;

public class TrappingRainWater {
    public static void main(String[] args) {
        int arr[]={3,0,1,2,5};
        int l[]=new int[arr.length];
        int r[]=new int[arr.length];
        int max=0;

        int lMax=arr[0];
        int rMax=arr[arr.length-1];

        l[0]=lMax;
        for(int i=1;i<arr.length;i++){
            l[i]=Math.max(arr[i],l[i-1]);
        }

        r[arr.length-1]=lMax;
        for(int i=arr.length-2;i>=0;i--){
            r[i]=Math.max(arr[i],r[i+1]);
        }

        for(int i=1;i<arr.length-1;i++){
            max=max+Math.min(l[i],r[i])-arr[i];
        }

        System.out.print("Max="+max);
    }
}
