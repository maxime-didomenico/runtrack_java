public class ListeEntierExercice {
    public static void main(String[] args) {
        int lenght = args.length;
        int[] tab = new int[lenght];
        int i = 0;
        int res = 0;

        while (i < lenght) {
            try {
                tab[i] = Integer.parseInt(args[i]);
                if ((tab[i] % 2) == 0) {
                    res += tab[i];
                    System.out.println("tab[" + i + "] = " + tab[i]);
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Erreur : " + e.getMessage());
            }
            i++;
        }
        System.out.println("Somme des positifs = " + res);
    }
}