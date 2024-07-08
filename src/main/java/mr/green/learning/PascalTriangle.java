package mr.green.learning;

import java.util.*;

public class PascalTriangle {

    private final Map<Integer, List<Integer>> indexToRow = new TreeMap<>(Map.of(
            0, List.of(1), 1, List.of(1, 1)));


    public List<Integer> getRow(int rowIndex) {

        while (!indexToRow.containsKey(rowIndex)) {
            addRows();
        }
        return indexToRow.get(rowIndex);
    }

    private void addRows() {
        var entry = lastRow();
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for (int i = 1; i < entry.getValue().size(); i++) {
            Integer cell = entry.getValue().get(i - 1) + entry.getValue().get(i);
            row.add(cell);
        }
        row.add(1);
        indexToRow.put(entry.getKey() + 1, row);
    }


    private Map.Entry<Integer, List<Integer>> lastRow() {
        return indexToRow.entrySet().stream()
                .max(Map.Entry.comparingByKey())
                .orElseThrow(() -> new IllegalArgumentException("Last Row Missing"));
    }
}
