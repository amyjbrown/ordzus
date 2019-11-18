package amy.ordzus;
import amy.ordzus.Query;
import java.util.Map;

public class AddQuery implements Query {
    private String name, value;

    AddQuery(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public void apply(Map<String, String> map) {
        map.put(this.name, this.value);
    }
}
