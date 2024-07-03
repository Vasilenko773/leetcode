package mr.green.learning;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (numToIndex.containsKey(num)) {
                Integer containingIndx = numToIndex.get(num);
                if (Math.abs(containingIndx - i) <= k) {
                    return true;
                }
                numToIndex.put(num, i);
            }
            numToIndex.put(num, i);
        }
        return false;
    }
}
