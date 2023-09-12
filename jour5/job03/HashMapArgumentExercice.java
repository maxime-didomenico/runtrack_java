import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapArgumentExercice {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        int i = 0;

        if (args.length % 2 == 0) {
            while (i < args.length) {
                map.put(args[i], args[i + 1]);
                i += 2;
            }
        } else {
            System.out.println("Error: the number of arguments must be even.");
            return;
        }

        for (Map.Entry<String, String> entry : map.entrySet()) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
