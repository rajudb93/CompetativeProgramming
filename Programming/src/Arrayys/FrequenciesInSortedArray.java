package Arrayys;

public class FrequenciesInSortedArray {
    public static void main(String[] args) {
        int arr[]={10,10,10,25,25,30,30,30,32,40};
        int counter=1;
        int i;

        for(i=1;i<=arr.length-1;i++){
            if(arr[i]==arr[i-1]){
                counter++;
            }
            if(arr[i]!=arr[i-1]){
               System.out.println("Frequencies of "+arr[i-1]+" is "+counter);
               counter=1;
            }
        }

        System.out.println("Frequencies of "+arr[i-1]+" is "+counter);
    }
}
