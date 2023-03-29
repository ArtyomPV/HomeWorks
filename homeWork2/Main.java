package homeWork2;

import java.io.IOException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
//        =========первая задача===================
        StringBuilder sb = new StringBuilder();

        ExampleHashMap data = new ExampleHashMap();
        HashMap<String, String> keysAndValues = new HashMap<>();

        keysAndValues.put("name", "Ivanov");
        keysAndValues.put("country", "Russia");
        keysAndValues.put("city", "Moscow");
        keysAndValues.put("age", "null");

        System.out.println(keysAndValues);
        sb = data.getCondition(keysAndValues);
        System.out.println(sb);



//        =========вторая задача===================
        FileLog fileLog = new FileLog();
        int[] sortArr = {12, 6, 4, 1, 15, 10};
        fileLog.bubbleSort(sortArr);
        for(int i = 0; i < sortArr.length; i++){
              System.out.print(sortArr[i] + " ");
        }


    }
}
