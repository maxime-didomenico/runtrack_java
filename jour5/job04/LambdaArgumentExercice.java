public class LambdaArgumentExercice {
    public static void main(String[] args) {
        String str = args[0];
        int length = Integer.parseInt(args[1]);

        LambdaFunc stringOperation = (s, l) -> {
            if (s.length() > l) {
                System.out.println("La chaine " + s + " a une longueur supérieure à " + l);
            } else {
                System.out.println("La chaine " + s + " a une longueur inférieure à " + l);
            }
            return s;
        };
        stringOperation.apply(str, length);
    }
}

@FunctionalInterface
interface LambdaFunc {
    String apply(String s, int l);
}
