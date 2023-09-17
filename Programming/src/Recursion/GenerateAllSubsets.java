package Recursion;

import java.util.ArrayList;

public class GenerateAllSubsets {
    public static void main(String[] args) {
        String str="FUN";
        ArrayList<String> ar=new ArrayList<String>();

        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                ar.add(str.substring(i,j+1));

            }
        }
        System.out.println(ar);
    }
}
