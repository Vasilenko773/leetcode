package mr.green.learning;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

    private List<String> ranges = new ArrayList<>();

    public List<String> summaryRanges(int[] nums) {
        if (isEmpty(nums)) {
            return ranges;
        }

        List<Integer> lastRange = iterateAndAdd(nums);
        addLastElement(lastRange);
        return ranges;
    }

    private List<Integer> iterateAndAdd(int[] iterable) {
        int start = iterable[0];
        int current = iterable[0];

        for (int index = 1; index < iterable.length; index++) {
            if (iterable[index] == (current + 1)) {
                current = iterable[index];
            } else if (start == current) {
                ranges.add("" + start);
                current = iterable[index];
                start = iterable[index];
            } else {
                ranges.add(start + "->" + current);
                start = iterable[index];
                current = iterable[index];
            }
        }
        return List.of(start, current);
    }

    private boolean isEmpty(int[] candidate) {
        return candidate.length == 0;
    }


    private void addLastElement(List<Integer> lastRange) {
        int start = lastRange.get(0);
        int end = lastRange.get(1);
        if (start == end) {
            ranges.add("" + start);
        } else {
            ranges.add(start + "->" + end);
        }
    }
}
