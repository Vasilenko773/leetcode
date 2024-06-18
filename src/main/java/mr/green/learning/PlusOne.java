package mr.green.learning;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        int lastIndex = digits.length - 1;
        if (valueForIndexEqualsNine(lastIndex, digits)) {
            return sumWithOne(digits);
        }
        digits[digits.length - 1] = digits[lastIndex] + 1;
        return digits;
    }

    private int[] sumWithOne(int[] source) {
        int lastIndex = source.length - 1;
        while (valueForIndexEqualsNine(lastIndex, source)) {
            source[lastIndex] = 0;
            lastIndex--;
            if (lastIndex < 0) {
                return sumAndEnlarged(source);
            }
        }
        source[lastIndex] = source[lastIndex] + 1;
        return source;
    }

    private boolean valueForIndexEqualsNine(int endIndex, int[] source) {
        return endIndex >= 0 && source[endIndex] == 9;
    }

    private int[] sumAndEnlarged(int[] source) {
        int[] increment = new int[source.length + 1];
        System.arraycopy(source, 0, increment, 1, source.length);
        increment[0] = 1;
        return increment;
    }
}
