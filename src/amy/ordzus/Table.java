package amy.ordzus;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.HashMap;
import java.util.Stack;

public class Table {
    private Map<String, String> current = new HashMap<>();
    private Stack<Map<String, String>> history = new Stack<>();
    private LocalDateTime modified;

    Table() {
        this.modified = LocalDateTime.now();
    }

    private void update(){
        history.push(new HashMap<>(current));
    }

    void add(String name, String value) {
        
    }

}
