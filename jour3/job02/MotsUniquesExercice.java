public class MotsUniquesExercice {
    public static void main(String[] args) {
        System.out.print("Mots uniques: ");
        int i = 0;
        int j = 0;

        while (i < args.length) {
            boolean estUnique = true;
            while (j < args.length) {
                if (i != j && args[i].equals(args[j])) {
                    estUnique = false;
                    break;
                }
                j++;
            }
            if (estUnique) {
                System.out.print(args[i] + " ");
            }
            i++;
            j = 0;
        }
    }
    System.out.print("\n");
}