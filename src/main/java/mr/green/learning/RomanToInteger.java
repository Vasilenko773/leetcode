package mr.green.learning;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanToInteger {

    public int romanToInt(String roman) {
        Map<String, Integer> romanNumToCount = new LinkedHashMap<>();
        romanNumToCount.put("IV", 4);
        romanNumToCount.put("IX", 9);
        romanNumToCount.put("XL", 40);
        romanNumToCount.put("XC", 90);
        romanNumToCount.put("CD", 400);
        romanNumToCount.put("CM", 900);
        romanNumToCount.put("I", 1);
        romanNumToCount.put("V", 5);
        romanNumToCount.put("X", 10);
        romanNumToCount.put("L", 50);
        romanNumToCount.put("C", 100);
        romanNumToCount.put("D", 500);
        romanNumToCount.put("M", 1000);

        int rsl = 0;
        for (var entry : romanNumToCount.entrySet()) {
            while (roman.contains(entry.getKey())) {
                roman = roman.replaceFirst(entry.getKey(), "");
                rsl += entry.getValue();
            }
        }
        return rsl;
    }
}
