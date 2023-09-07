public class VoitureExercice {
    public static void main(String[] args) {
        Car voiture = new Car();
        float speed = Float.parseFloat(args[0]);
        voiture.speedUp((int)speed);
    }
}

class Car {
    float speed = 0;

    public void speedUp (float speed) {
        try {
            if (speed > 100) {
                throw new MyException("VitesseLimiteDepasseException.");
            }
            if (speed < 0) {
                throw new MyException("VitesseNegativeException.");
            }
            this.speed += speed;
            System.out.println("La voiture roule à " + this.speed + " km/h.");
        }
        catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}

class MyException extends Exception {

    public MyException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Erreur : " + super.getMessage();
    }
}