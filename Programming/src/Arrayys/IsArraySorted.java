package Arrayys;

public class IsArraySorted {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        boolean flag=true;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                flag=false;
                break;
            }
        }

        if(flag==false){
            System.out.println("Not sorted");
        }
        else{
            System.out.println("sorted");
        }
    }
}
