package nio.zadanie2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CSVData {
    private final List<String> columns;
    private final List<String[]> records;
    public CSVData(List<String> columns, List<String[]> records) {
        this.columns = columns;
        this.records = records;
    }

    public List<String> getColumns() {
        return columns;
    }

    public String getColumnsName(int index) {
        return columns.get(index);
    }
    public int getColumnsSize(){
        return columns.size();
    }
    public List<String[]> getRecords() {
        return records;
    }
}
