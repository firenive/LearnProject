package additionalInformation.Arrays.Massive;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIterators {
    public static void main(String[] args) {
        // 1.
        HashMap<String, String> hashmap = null;
        for (Map.Entry<String, String> entry: hashmap.entrySet())
            System.out.println(entry.getKey() + " = " + entry.getValue());

        // 2.
        for (String key: hashmap.keySet())
            System.out.println(hashmap.get(key));

        // 3.
        Iterator<Map.Entry<String, String>> itr = hashmap.entrySet().iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
