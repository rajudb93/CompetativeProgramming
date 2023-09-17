package heroVired;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        //LinkedList is good when there is insertion and deletion aat starting or ending nodes

        LinkedList<Integer> list=new LinkedList<>();

        list.add(1);
        list.add(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.addFirst(6);
        list.removeLast();
        System.out.println(list.getFirst());

    }
}
