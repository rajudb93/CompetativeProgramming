package heroVired;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<Integer>();
        st.add(0);
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);

/*      System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.remove(1));*/
        System.out.println(st);
        System.out.println(st.search(2));


    }
}
