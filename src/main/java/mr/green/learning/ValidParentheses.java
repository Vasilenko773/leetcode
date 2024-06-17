package mr.green.learning;

public class ValidParentheses {

    public boolean isValid(String source) {
        while (containingPairedBrackets(source)) {
            source = withoutBracket(source, "{}");
            source = withoutBracket(source, "[]");
            source = withoutBracket(source, "()");
        }
        return source.isEmpty();
    }


    private boolean containingPairedBrackets(String candidate) {
        return candidate.contains("()")
                || candidate.contains("{}")
                || candidate.contains("[]");
    }

    private String withoutBracket(String target, String bracket) {
        return target.replace(bracket, "");
    }
}
