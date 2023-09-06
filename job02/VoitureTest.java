public class VoitureTest {
    public static void main(String[] args) {
        Car voiture = new Car();

        voiture.start();
        voiture.speedUp();
        voiture.speedUp();
        voiture.stop();
    }
}

class Car {
    String brand = "Tesla";
    String color = "blanche";
    int speed = 0;
    boolean status = false;

    public void start() {
        if (status == false) {
            status = true;
            System.out.println("La voiture démarre.");
        }
        else {
            System.out.println("La voiture est déjà démarrée.");
        }
    }

    public void stop() {
        if (status == true) {
            status = false;
            System.out.println("La voiture s'arrête.");
            speed = 0;
        }
        else {
            System.out.println("La voiture est déjà arrêtée.");
        }
    }

    public void speedUp () {
        if (status == true) {
            this.speed += 10;
            System.out.println("La voiture accélère de " + this.speed + " km/h");
        }
        else {
            System.out.println("La voiture est arrêtée mon reuf.");
        }
    }
}