package Recursion;

public class FindSumOfDigits {
    public static void main(String[] args) {
        int num=253;
        int sum=0;
        System.out.println(fun1(num));
    }

    private static int fun1(int num) {
        if(num==0)
            return 0;

        int rem=num%10;

       return rem+fun1(num/10);




    }
}
