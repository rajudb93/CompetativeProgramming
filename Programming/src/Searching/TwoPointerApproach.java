package Searching;

public class TwoPointerApproach {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 30};
        int x = 17;

        int i = 0;
        int j = arr.length - 1;
        boolean flag=false;

        while (i < j) {
            if (arr[i] + arr[j] == x) {

                flag=true;
                break;
            }
            else if(arr[i] + arr[j]>x)
                j--;
            else i++;
        }

        if(flag==true){
            System.out.print("found");
        }
        else{
            System.out.print("Not found");
        }
    }
}
