package Recursion;

/*Expected Out is in below order
1
2
1
3
1
2
1*/

public class RecursionBestExample {
    public static void main(String[] args) {
        fun1(3);
    }

    private static void fun1(int n) {
        if (n == 0)
            return;
        fun1(n - 1);
        System.out.println(n);
        fun1(n - 1);

    }
}
