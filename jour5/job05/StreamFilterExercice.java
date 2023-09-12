import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExercice {
    public static void main(String[] args) {
        int i = 1;
        int n = Integer.parseInt(args[0]);
        List<Integer> list = new ArrayList<>();

        while (i < args.length) {
            list.add(Integer.parseInt(args[i]));
            i++;
        }

        List<Integer> nSup = list.stream()
            .filter(x -> x > n)
            .collect(Collectors.toList());

        printList(nSup, n);
    }

    public static void printList(List<Integer> list, int n) {
        System.out.print("Liste des nombres supérieurs à " + n + ":");
        for (Integer i : list) {
            System.out.print(" " + i);
        }
        System.out.println();
    }
}
