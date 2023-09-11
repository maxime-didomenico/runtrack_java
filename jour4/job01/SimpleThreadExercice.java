public class SimpleThreadExercice extends Thread {


    @Override
    public void run() {
        int i = 0;

        while (i < 5) {
            
            try {
                Thread.sleep(5000);
                System.out.println("Salut du thread n°" + (i + 1));
                i++;
            }
            catch (InterruptedException e) {
                System.out.println("Erreur : " + e.getMessage());
            }
        }

    }

    public static void main(String[] args) {
        SimpleThreadExercice thread = new SimpleThreadExercice();
        thread.start();
    }
}