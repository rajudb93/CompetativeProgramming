package Mathematics;

public class CheckIfNumberIsPallindrome {
    public static void main(String[] args) {
        int num=2662;
        System.out.println("Is number is pallindrome?="+isNumberPallindrome(num));
    }

    private static boolean isNumberPallindrome(int num) {
        int cal=0;
        int quo=num;
        while(quo!=0){
            int rem=quo%10;
            quo=quo/10;
            cal=cal*10+rem;

        }

        if(num==cal)
            return true;
        else
            return false;
    }
}
