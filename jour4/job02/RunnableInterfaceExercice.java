public class RunnableInterfaceExercice implements Runnable {

    @Override
    public void run() {
        int i = 0;

        while (i < 5) {
            
            try {
                Thread.sleep(1000);
                System.out.println("En cours d'execution... ");
                i++;
            }
            catch (InterruptedException e) {
                System.out.println("Erreur : " + e.getMessage());
            }
        }

    }

    public static void main(String[] args) {
        Runnable runnable = new RunnableInterfaceExercice();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}