package mr.green.learning;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

public class ContainsDuplicateBenchMark {

    @State(Scope.Thread)
    public static class ArrayBenchmark {
        int[] array = new int[] {1, 2, 3, 1, 2, 3};
    }

    @Benchmark
    @Fork(1)
    @Warmup(iterations = 3)
    @Measurement(iterations = 3)
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public void test(ArrayBenchmark state) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        containsDuplicate.containsNearbyDuplicate(state.array, 2);
    }
}
