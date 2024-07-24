package mr.green.learning;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    private final Map<Character, Integer> charToCount = new HashMap<>();
    private boolean oneExist = false;

    public int longestPalindrome(String s) {
        initCharStorage(s);
        int length = 0;

        for (var entry : charToCount.entrySet()) {
            Integer count = entry.getValue();
            length = incrementLength(length, count);
        }
        return length;
    }

    private void initCharStorage(String target) {
        for (char ch : target.toCharArray()) {
            charToCount.putIfAbsent(ch, 0);
            charToCount.computeIfPresent(ch, (key, val) -> val + 1);
        }
    }

    private int incrementLength(int current, Integer countChar) {
        if (countChar % 2 == 1) {
            if (oneExist) {
                current += countChar - 1;
            } else {
                current += countChar;
            }
            oneExist = true;
        } else {
            current += countChar;
        }
        return current;
    }
}
