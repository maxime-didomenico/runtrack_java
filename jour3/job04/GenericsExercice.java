public class GenericsExercice {
    public static void main(String[] args) {
        Boite<String> boite = new Boite<>();
        boite.ajouter(args[0]);
        String element = boite.recuperer();
        System.out.println("Contenu de la boite: " + element);
    }
}

class Boite<T> {
    private T element;

    public void ajouter(T element) {
        this.element = element;
    }

    public T recuperer() {
        return element;
    }
}