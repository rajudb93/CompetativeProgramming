package heroVired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseStreamForHashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(2, "Alice");
        map.put(3, "Bob");
        map.put(1, "Charlie");
        map.put(4, "David");
        map.put(5, "Eva");

        map.entrySet().stream()
                .forEach(entry -> System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()));

        map.entrySet().stream()
                .filter(entry -> entry.getKey() % 2 == 0)
                .forEach(entry -> System.out.println("Even Key: " + entry.getKey() + ", Value: " + entry.getValue()));

        map.entrySet().stream()
                .map(entry -> entry.getValue().toUpperCase())
                .forEach(value -> System.out.println("Uppercase Value: " + value));

        List<Integer> keysList = map.keySet().stream().collect(Collectors.toList());
        System.out.println("Keys List: " + keysList);

        //Sort by value
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> System.out.println("Sorted Key: " + entry.getKey() + ", Value: " + entry.getValue()));

        map.entrySet().stream()
                .limit(2)
                .forEach(entry -> System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()));

        map.entrySet().stream()
                .skip(2)
                .forEach(entry -> System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()));


        long count = map.entrySet().stream().count();
        System.out.println("Number of Elements: " + count);

        boolean anyMatch = map.entrySet().stream().anyMatch(entry -> entry.getKey() == 3);
        System.out.println("Any Key is 3: " + anyMatch);

        boolean allMatch = map.entrySet().stream().allMatch(entry -> entry.getValue().startsWith("A"));
        System.out.println("All Values start with 'A': " + allMatch);

        boolean noneMatch = map.entrySet().stream().noneMatch(entry -> entry.getValue().contains("z"));
        System.out.println("No Value contains 'z': " + noneMatch);


        // Filtering and Collecting into a new HashMap
        Map<Integer, String> newMap = map.entrySet().stream()
                .filter(entry -> entry.getKey() > 2)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (existingValue, newValue) -> existingValue));

        System.out.println("New HashMap: " + newMap);


        map.entrySet().parallelStream()
                .filter(entry -> entry.getKey() % 2 == 0)
                .forEach(entry -> System.out.println("Even Key: " + entry.getKey() + ", Value: " + entry.getValue()));







    }
}
