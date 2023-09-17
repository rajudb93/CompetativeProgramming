package Recursion;

public class Print_1_To_N {
    public static void main(String[] args) {
        fun(5);
    }

    private static void fun(int num) {
        if(num==0)
            return;
        fun(num-1);
        System.out.println(num);
    }
}
