public class ThreadInterruptionExercice {
    public static void main(String[] args) {
        int tempsTotal = Integer.parseInt(args[0]);
        int tempsAvantInterruption = tempsTotal / 2;

        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(tempsTotal * 1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrompu après " + tempsAvantInterruption + " secondes.");
            }
        });

        thread.start();

        try {
            Thread.sleep(tempsAvantInterruption * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.interrupt();
    }
}