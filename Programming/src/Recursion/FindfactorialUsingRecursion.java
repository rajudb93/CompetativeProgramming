package Recursion;

public class FindfactorialUsingRecursion {
    public static void main(String[] args) {
       int num= fact(5);
       System.out.println("Factorial of the number is="+num);
    }

    private static int fact(int num) {
        if(num==0)
            return 1;
        return num*fact(num-1);


    }
}
