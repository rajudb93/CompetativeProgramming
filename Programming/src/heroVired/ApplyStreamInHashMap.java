package heroVired;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ApplyStreamInHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> scores=new HashMap<>();
        scores.put("Alice", 85);
        scores.put("Bob", 92);
        scores.put("Charlie", 78);
        scores.put("David", 95);
        scores.put("Eve", 88);
       Map<String,Integer> filteredScores= scores.entrySet().stream().filter(score->score.getValue()>80).sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(filteredScores);
    }
}
