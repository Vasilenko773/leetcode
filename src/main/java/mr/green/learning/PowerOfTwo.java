package mr.green.learning;

public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        return isDegreeForTwo(n);
    }

    private boolean isDegreeForTwo(int n) {
        int i = 0;
        double pow = Math.pow(2, i);
        while (pow <= n) {
            if (pow == n) {
                return true;
            }
            pow = Math.pow(2, ++i);
        }
        return false;
    }
}
