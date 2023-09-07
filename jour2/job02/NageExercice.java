public class NageExercice {
    public static void main(String[] args) {
        Nageur nageur = new Homme();
        nageur.nager();

        nageur = new Poisson();
        nageur.nager();
    }
}