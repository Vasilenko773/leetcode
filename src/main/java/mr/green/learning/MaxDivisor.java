package mr.green.learning;

public class MaxDivisor {

    public int max(int num1, int num2) {
        while (isMaxDivisor(num1, num2)) {
            if (num1 > num2) {
                num1 = num1 % num2;
            } else {
                num2 = num2 % num1;
            }
        }
        return Math.min(num1, num2);
    }

    private boolean isMaxDivisor(int num1, int num2) {
        return Math.max(num1, num2) % Math.min(num1, num2) != 0;
    }
}
