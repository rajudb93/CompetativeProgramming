package Mathematics;

public class FindTrailingZerosInFactorial {
    public static void main(String[] args) {
        long num=10;
        long fact=1;

        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        long q=fact;
        long rem=0;
        int counter=0;
        while(q!=0){
            rem=q%10;
            q=q/10;

            if(rem==0){
                counter++;
            }
            else{
                break;
            }
        }
        System.out.println("Number of Trailing zeros in the found factorial umber is="+counter);
    }
}
