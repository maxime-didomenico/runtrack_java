import java.util.Random;

public class JeuDeDes {
    public static void main(String[] args) {
        Random rand = new Random();
        int one = rand.nextInt(6) + 1;
        int two = rand.nextInt(6) + 1;

        System.out.println("Dé 1: " + one);
        System.out.println("Dé 2: " + two);
        System.out.println("Somme: " + (one + two));
    }
}