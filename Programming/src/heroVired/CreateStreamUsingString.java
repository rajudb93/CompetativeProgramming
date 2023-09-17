package heroVired;

import java.util.stream.Stream;

public class CreateStreamUsingString {
    public static void main(String[] args) {
        Stream<String> str=Stream.of("Raju","Bhoj","Rajib","Hemant","Ashwini","Rajat");
        str.forEach(System.out::println);
    }
}
