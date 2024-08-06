package mr.green.learning;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> firstMap = charToCount(s);
        Map<Character, Integer> secondMap = charToCount(t);
        return secondMap.equals(firstMap);
    }

    private Map<Character, Integer> charToCount(String source) {
        Map<Character, Integer> charToCount = new HashMap<>();
        for (char c : source.toCharArray()) {
            charToCount.putIfAbsent(c, 1);
            charToCount.computeIfPresent(c, (key, val) -> val + 1);
        }
        return charToCount;
    }
}
