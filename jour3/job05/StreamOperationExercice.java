import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperationExercice {
    public static void main(String[] args) {
        List<Integer> nombres = Arrays.stream(args)
            .map(n -> {
                try {
                    return Integer.parseInt(n);
                }
                catch (NumberFormatException e) {
                    return null;
                }
            })
            .filter(n -> n != null)
            .collect(Collectors.toList());

        List<Integer> resultats = nombres.stream()
            .filter(n -> n * 2 > 10)
            .collect(Collectors.toList());

        System.out.println(resultats);
    }
}