package mr.green.learning;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        s = s.replaceAll("[\\p{Punct}\\s]", "").toLowerCase();
        if (s.isBlank()) {
            return true;
        }
        return isReadsSameBackAndForward(s);
    }

    private boolean isReadsSameBackAndForward(String source) {
        int start = 0;
        int center = centerIndexFor(source);
        int end = source.length() - 1;
        while (start <= center) {
            char headChar = source.charAt(start++);
            char tailChar = source.charAt(end--);
            if (headChar != tailChar) {
                return false;
            }
        }
        return true;
    }

    private int centerIndexFor(String target) {
        return target.length() % 2 == 0 ? (target.length() / 2) - 1 : target.length() / 2;
    }
}
