package mr.green.learning.greedy_algorithm;

public class ReplaceToMaxRight {

    public int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int next = i + 1;
            arr[i] = -1;
            while (next < arr.length) {
                replaceIfLess(arr, i, next);
                next++;
            }
        }
        return arr;
    }

    private void replaceIfLess(int[] arr, int current, int next) {
        if (arr[current] < arr[next]) {
            arr[current] = arr[next];
        }
    }
}
