import java.util.HashSet;
import java.util.Iterator;

public class HashSetArgumentExercice {
    public static void main(String[] args) {
        int i = 0;
        HashSet<String> strings = new HashSet<>();

        while(i < args.length){
            if (HashSetCheck(strings, args[i]) == 0){
                strings.add(args[i]);
            }
            i++;
        }
        HashSetPrint(strings);        
    }

    public static int HashSetCheck(HashSet<String> strings, String str) {
        if (strings.contains(str)){
            return (1);
        }
        return (0);
    }

    public static void HashSetPrint(HashSet<String> strings) {
        Iterator<String> iterator = strings.iterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}