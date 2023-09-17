package heroVired;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SingleStream {
    public static void main(String[] args) {
        List<Integer> list1= Arrays.asList(1,2,3,4,5);
        List<Integer> list2= Arrays.asList(6,7,8,9,10);
        List<Integer> list3= Arrays.asList(11,12,13,14,15);

        List<Integer> finalList= Stream.of(list1,list2,list3).flatMap(List::stream).collect(Collectors.toList());
        System.out.println(finalList);


        //AnyMatch - its a terminal operation
        List<String> str=Arrays.asList("Raju","Science","geography","History");
        boolean bol=str.stream().anyMatch(s->s.contains("Sci"));
        System.out.println(bol);

        //Allmatch - Its a terminal function
        boolean allStartWithUppercase = str.stream()
                .allMatch(s -> s.length()>3);
        System.out.println(allStartWithUppercase);

        //reduce() is also a terminal function. It can be used to convert the stream of values into single output

        String s=str.stream().reduce((a,b)->a+" "+b).orElse("");
        System.out.println("Single String="+s);

        //find the sum using reduce()
        int sum=list1.stream().reduce((a,b)->a+b).orElse(0);
        System.out.println("Sum of all integers="+sum);

        //Find max
        int max=list1.stream().reduce(Integer::max).orElse(-1);
        System.out.println("Max="+max);
    }
}
