package Recursion;

public class FindSumOfnaturalNumbers {
    public static void main(String[] args) {
        int n=10;
        System.out.println("sum of natural number "+n+" is "+fun(n));
    }

    private static int fun(int n) {

        if(n==0)
            return 0;

       return  n+fun(n-1);



    }
}
