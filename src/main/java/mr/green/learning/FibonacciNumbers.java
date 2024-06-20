package mr.green.learning;

/**
 * Последовательность фибоначи нкачинается с 0 и 1 и
 * каждое следующее значение, является суммой двух предыдущих.
 */
public class FibonacciNumbers {

    public int fib(int n) {
        int[] fibonacci = fibonacciQueueOrEmptyFor(n);
        return fibonacci.length == 0
                ? n
                : fibonacci[n - 1] + fibonacci[n - 2];
    }

    private int[] fibonacciQueueOrEmptyFor(int number) {
        if (isContainsTwoPrevious(number)) {
            int[] fibonacciQueue = new int[number];
            fibonacciQueue[0] = 0;
            fibonacciQueue[1] = 1;
            for (int i = 2; i < number; i++) {
                fibonacciQueue[i] = fibonacciQueue[i - 1] + fibonacciQueue[i - 2];
            }
            return fibonacciQueue;
        } else {
            return new int[0];
        }
    }

    private boolean isContainsTwoPrevious (int number) {
        return number >= 2;
    }
}
