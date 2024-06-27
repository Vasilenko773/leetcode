package mr.green.learning.greedy_algorithm;

public class MaxDivisorStrings {

    public String gcdOfStrings(String str1, String str2) {
        int start = 0;
        String maxDivisor = "";
        int end = Math.min(str1.length(), str2.length());
        boolean isContained;
        do {
            start++;
            String lineDivider = str2.substring(0, start);
            isContained = isDivisorFor(str1, lineDivider) && isDivisorFor(str2, lineDivider);
            maxDivisor = isContained ? lineDivider : maxDivisor;
        } while (start < end);
        return maxDivisor;
    }

    private boolean isDivisorFor(String source, String lineDivider) {
        return source.replace(lineDivider, "").isEmpty();
    }
}
