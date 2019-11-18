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

    // TODO add to string for outputting
}
