import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class StreamMapExercice {
    public static void main(String[] args) {
        int i = 0;
        List<String> list = new ArrayList<>();

        while (i < args.length) {
            if (args[i] != null) {
                list.add(args[i]);
            }
            i++;
        }

        List<String> toMaj = list.stream()
            .map(x -> x.toUpperCase())
            .collect(Collectors.toList());

        printList(toMaj);
    }

    public static void printList(List<String> list) {
        System.out.print("Liste des arguments en majuscule:");
        for (String i : list) {
            System.out.print(" " + i);
        }
        System.out.println();
    }
}