package Recursion;

public class FindMaximumCutInRope {
    public static void main(String[] args) {
        int n=45,a=11,b=9,c=12;

        System.out.println("Number of maximum cuts="+maxCuts(n,a,b,c));
    }

    private static int maxCuts(int n, int a, int b, int c) {
        if(n==0)
            return 0;
        if(n<0)
            return -1;

        int p1=maxCuts(n-a, a,b, c);
        int p2=maxCuts(n-b, a,b, c);
        int p3=maxCuts(n-c, a,b, c);

        int max=Math.max(Math.max(p1,p2),p3);

        if(max<0)
            return -1;
        return max+1;
    }

}
