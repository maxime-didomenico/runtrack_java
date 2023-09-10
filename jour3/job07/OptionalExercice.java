import java.util.Optional;

public class OptionalExercice {
    public static void main(String[] args) {
        String chaine = args.length > 0 ? args[0] : null;
        String resultat = getLongueurChaine(chaine);
        System.out.println(resultat);
    }

    public static String getLongueurChaine(String chaine) {
        return Optional.ofNullable(chaine)
            .map(String::length)
            .map(String::valueOf)
            .orElse("Chaîne non fournie");
    }
}
