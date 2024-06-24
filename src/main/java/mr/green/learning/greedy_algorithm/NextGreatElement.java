package mr.green.learning.greedy_algorithm;

public class NextGreatElement {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                // Заменить на следующий максимальный или на -1
                if (nums1[i] == nums2[j]) {
                    int negativeOrMax = maxNextElementOrMinusOne(j, nums2);
                    nums1[i] = negativeOrMax;
                    break;
                }
            }
        }
        return nums1;
    }

    private int maxNextElementOrMinusOne(int startIndex, int[] source) {
        int max = source[startIndex];
        int indexMaxElement = startIndex;
        for (int i = startIndex; i < source.length; i++) {
            if (source[i] > max) {
                max = source[i];
                indexMaxElement = i;
                break;
            }
        }
        return indexMaxElement == startIndex ? -1 : max;
    }
}
