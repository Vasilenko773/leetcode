package mr.green.learning;

import java.util.Arrays;

public class NumberSegmentsInString {

    public int countSegments(String s) {

        return (int) Arrays.stream(s.split(" "))
                .filter(str -> !str.isEmpty())
                .count();
    }
}
