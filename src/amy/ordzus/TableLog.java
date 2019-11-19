package amy.ordzus;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class TableLog {
    final Map<String, String> map;
    final LocalDateTime modified;

    TableLog(Map<String, String> map) {
        this.map = new HashMap<>(map);
        this.modified = LocalDateTime.now();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("");
        if (map.toString().length() <= 20) {
            sb.append(map);
        } else {
            sb.append(map.toString().substring(0,20));
            sb.append("...}");
        }
        // Now Add modified time
        sb.append(" @"); sb.append(modified);

        return sb.toString();
    }
}
