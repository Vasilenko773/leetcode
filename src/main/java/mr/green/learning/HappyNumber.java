package mr.green.learning;

import lombok.RequiredArgsConstructor;

import java.util.*;

@RequiredArgsConstructor
public class HappyNumber {

    public boolean isHappy(int n) {
        int[] integers = convertedFrom(n);
        do {
            int sum = sumNumbersFrom(integers);
            if (sum == 1) {
                return true;
            }
            integers = convertedFrom(sum);
        } while (integers.length > 1 || integers[0] == 7);
        return n == 1;
    }

    private int[] convertedFrom(int number) {
        return Arrays.stream(String.valueOf(number).split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private int sumNumbersFrom(int[] sources) {
        int sum = 0;
        for (int current : sources) {
            sum = current == 0
                    ? sum
                    : sum + (current * current);
        }
        return sum;
    }
}
