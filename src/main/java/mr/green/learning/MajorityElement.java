package mr.green.learning;

import java.util.LinkedHashMap;
import java.util.Map;

public class MajorityElement {

    private Map<Integer, Integer> numToCount = new LinkedHashMap<>();

    public int majorityElement(int[] nums) {
        for (int num : nums) {
            numToCount.putIfAbsent(num, 0);
            incrementAndAdd(num);
        }
        return getMajorityOrZero(nums.length);
    }

    private void incrementAndAdd(Integer key) {
        int count = numToCount.get(key);
        count += 1;
        numToCount.put(key, count);
    }

    private int getMajorityOrZero(int length) {
       return numToCount.entrySet().stream()
                .filter(entry -> entry.getValue() > length / 2)
                .findFirst().orElse(Map.entry(0, 0))
                .getKey();
    }
}
