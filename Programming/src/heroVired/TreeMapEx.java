package heroVired;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<Integer,String>  map=new TreeMap<>();
        map.put(1,"AA");
        map.put(4,"BB");
        map.put(2,"CC");
        map.put(3,"DD");
        for(Map.Entry<Integer,String> m: map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        System.out.println(map.remove(4));
        System.out.println(map);

    }

}
