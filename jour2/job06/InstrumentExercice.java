public class InstrumentExercice {
    public static void main(String[] args) {
        Instrument guitare = new Guitare();
        guitare.jouer();
        Instrument piano = new Piano();
        piano.jouer();

    }
}

class Guitare implements Instrument {
    public void jouer() {
        System.out.println("La guitare joue un air rock.");
    }
}

class Piano implements Instrument {
    public void jouer() {
        System.out.println("Le piano joue une melodie douce.");
    }
}

