import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamChainesExercice {
    public static void main(String[] args) {
        List<String> str = Arrays.stream(args)
            .map(n -> {
                try {
                    return String.valueOf(n);
                }
                catch (NumberFormatException e) {
                    return null;
                }
            })
            .filter(n -> n != null)
            .collect(Collectors.toList());


        List<String> resultats = str.stream()
            .filter(n -> n.length() == 3)
            .filter(n -> n.charAt(0) == 'a')
            .collect(Collectors.toList());

        System.out.println(resultats);
    }
}