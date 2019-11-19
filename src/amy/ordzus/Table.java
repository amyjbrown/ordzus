package amy.ordzus;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.HashMap;
import java.util.Stack;

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

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("<Table last modified at "); sb.append(modified); sb.append(">\n");
        sb.append(current);
        sb.append("\n--------------------------------------------------------");

        if (history.size() > 0) {
            for (int i = 0;  i < 3 && i < history.size(); i++) {
                sb.append("\n*");
                sb.append(history.get(history.size() - i - 1));
            }
            // Now to either add
            // ...
            // *{###} @ DDD
            if (history.size() > 5) {
                sb.append("\n..."); sb.append("\n*");
                sb.append(history.get(0));
            }
            // Or simply the pneulatimate entry (so we show current  + 4 previous states)
            else if (history.size() == 4){
                sb.append("\n*");
                sb.append(history.get(0));
            }

            sb.append("\n");
        }

        return sb.toString();
    }
}
