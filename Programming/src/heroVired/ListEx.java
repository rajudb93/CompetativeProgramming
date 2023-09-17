package heroVired;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("ll");
        list.add(0,"Kk");
        list.add("Nn");
        list.add("PP");
        list.set(0,"tt");
        list.add(1,"AK");
        list.add(2,"WW");
        list.remove("AK");
      System.out.println(list);




    }
}
