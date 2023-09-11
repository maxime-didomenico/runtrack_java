public class SynchronizationExercice {

    private static volatile int solde;

    public static void main(String[] args) {

        int soldeInitial = Integer.parseInt(args[0]);
        int retrait = Integer.parseInt(args[1]);

        solde = soldeInitial;

        Thread thread1 = new Thread(new Retrait(1, retrait));
        Thread thread2 = new Thread(new Retrait(2, retrait));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Solde final : " + solde);
    }

    static class Retrait implements Runnable {

        private int id;
        private int retrait;

        public Retrait(int num, int retrait) {
            this.id = num;
            this.retrait = retrait;
        }

        @Override
        public synchronized void run() {
            if (solde >= retrait) {
                solde -= retrait;
                System.out.println("Thread" + this.id + " a retiré : " + this.retrait + ".");
            } else {
                System.out.println("Solde insuffisant");
            }
        }
    }
}