public class AnimalExercice {

    public static void main(String[] args) {
        Animal animal = new Chat();
        animal.faireDuBruit();

        animal = new Chien();
        animal.faireDuBruit();

        animal = new Oiseau();
        animal.faireDuBruit();
    }
}