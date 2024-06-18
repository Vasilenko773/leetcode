package mr.green.learning;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        int lastElement = digits[digits.length - 1];
        if (isLastElementNine(digits)) {
            return withIncreasesOfOne(digits);
        }
        digits[digits.length - 1] = lastElement + 1;
        return digits;
    }

    private boolean isLastElementNine(int[] source) {
        return source[source.length - 1] == 9;
    }

    private int[] withIncreasesOfOne(int[] source) {
        int endIndex = source.length - 1;
        while (valueForIndexEqualsNine(endIndex,source)) {
            source[endIndex] = 0;
            endIndex--;
            if (endIndex < 0) {
               int[] increment = new int[source.length + 1];
                System.arraycopy(source, 0, increment, 1, source.length);
                increment[0] = 1;
                return increment;
            }
        }
        source[endIndex] = source[endIndex] + 1;
        return source;
    }

    private boolean valueForIndexEqualsNine(int endIndex, int[] source) {
        return endIndex >= 0 && source[endIndex] == 9;
    }
}
