package Recursion;

public class RoperCutting {
    public static void main(String[] args) {
        int n=23,a=11,b=9,c=12;

        System.out.println("Maximum possible cut="+maxCut(n,a,b,c));
    }

    private static int maxCut(int n, int a, int b, int c) {
        if(n==0)
            return 0;
        if(n<0)
            return -1;
        int p1=maxCut(n-a,a,b,c);
        int p2=maxCut(n-b,a,b,c);
        int p3=maxCut(n-c,a,b,c);
        int p4=Math.max(p1,p2);

        int res=Math.max(p4,p3);

        if(res==-1)
            return  -1;
        return res+1;

    }
}
