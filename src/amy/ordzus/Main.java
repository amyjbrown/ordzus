package amy.ordzus;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import amy.ordzus.Query;
import amy.ordzus.AddQuery;

public class Main {
    // private static Map<String, String> table = new HashMap<>();
    private static Table table = new Table();

    public static void main(String[] args) {
        /* TODO
         * init...
         * while true:
         *   for query in get_queries():
         *       querry.apply(table)
         * */
        List<Query> exampleList = new ArrayList<>();
        {
            exampleList.add(new AddQuery("0", "bar"));
            exampleList.add(new AddQuery("1", "foo"));
            exampleList.add(new AddQuery("2", "qux"));
            exampleList.add(new AddQuery("3", "waz"));
            exampleList.add(new AddQuery("4", "mav"));
            exampleList.add(new AddQuery("5", "jaku"));
        }

        for (Query q: exampleList) {
            q.apply(table);
            System.out.println(table);
        }

        System.out.println(table.toString());
    }
}
