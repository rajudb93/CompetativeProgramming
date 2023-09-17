package Mathematics;

public class Find_GCD_OR_HCF {
    public static void main(String[] args) {
        int a=200,b=100;

        int small=Math.min(a,b);
        int high=Math.max(a,b);
        int temp=0;

        while(high%small!=0){
            temp=small;
            small=high%small;
            high=temp;
        }
        System.out.print(small);
    }
}
