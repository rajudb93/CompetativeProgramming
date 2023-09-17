package heroVired;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,3,4,5,6,7,8,9);
       List<Integer> squareNumbers= list.stream().map(x->x*x).collect(Collectors.toList());
        for (Integer indiavidualNumber:squareNumbers) {
            System.out.println(indiavidualNumber);

        }
    }
}
