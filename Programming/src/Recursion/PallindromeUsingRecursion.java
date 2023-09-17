package Recursion;

public class PallindromeUsingRecursion {
    public static void main(String[] args) {
        String str="abbcbba";
        int end=str.length()-1;
        int start=0;

        System.out.println("is pallindrome="+fun1(str,start,end));
    }

    private static boolean fun1(String str,int start, int end) {
        if(start==end)
            return true;
        if(str.charAt(start)==str.charAt(end))
            return true;

        if(str.charAt(start)!=str.charAt(end))
            return false;

        if(start<end){
            start++;
            end--;
            return fun1(str,start, end);

        }

       return true;
    }
}
