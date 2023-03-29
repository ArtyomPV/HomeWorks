package homeWork2;

import java.util.Map;


/*
Дана строка sql-запроса "select * from students where ".
Сформируйте часть WHERE этого запроса, используя StringBuilder.
Данные для фильтрации приведены ниже в виде json-строки.
Если значение null, то параметр не должен попадать в запрос.

Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 */

public class ExampleHashMap {

    public static StringBuilder getCondition(Map<String, String> params) {
        StringBuilder result = new StringBuilder("");

        for (Map.Entry<String, String> pair : params.entrySet()) {
            if (!pair.getValue().equals("null")) {
                if (result.toString().length() > 1) {
                    result.append(", ");
                }
                result.append("\"" + pair.getKey() + "\" : \"")
                        .append(pair.getValue() + "\"");
            }
        }
        return result;
    }
}
