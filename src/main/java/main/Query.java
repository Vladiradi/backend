package main;

import java.util.HashMap;
import java.util.Map;

public class Query {
    public static void main(String[] args) {

        Map<String, Object> params = new HashMap<>();
        params.put("model", "V-60");
        params.put("country", "Germany");
        params.put("city", "Berlin");
        params.put("year", null);
        params.put("active", true);


        String sqlQuery = buildQuery(params);
        System.out.println(sqlQuery);
    }


    public static String buildQuery(Map<String, Object> params) {
        StringBuilder query = new StringBuilder("SELECT * FROM cars");

        boolean firstCondition = true;
        for (Map.Entry<String, Object> entry : params.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();


            if (value == null) continue;


            if (firstCondition) {
                query.append(" WHERE ");
                firstCondition = false;
            } else {
                query.append(" AND ");
            }


            if (value instanceof String) {
                query.append(key).append(" = '").append(value).append("'");
            } else {
                query.append(key).append(" = ").append(value);
            }
        }

        return query.toString();
    }
}