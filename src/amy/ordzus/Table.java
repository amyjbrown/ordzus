package amy.ordzus;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.HashMap;
import java.util.Stack;
import amy.ordzus.TableLog;

public class Table {
    private Map<String, String> current = new HashMap<>();
    private Stack<TableLog> history = new Stack<>();
    private LocalDateTime modified;

    // Creation
    Table() {
        this.modified = LocalDateTime.now();
    }

    private void update(){
        history.push(new TableLog(current));
        modified = LocalDateTime.now();
    }

    void add(String name, String value) {
        update();
        current.put(name, value);
    }

    void del(String name) {
        if (current.containsKey(name)) {
            update();
            current.remove(name);
        }
    }
}
