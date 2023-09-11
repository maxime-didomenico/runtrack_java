import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExercice {
    public static void main(String[] args) {
        double soldeInitial = Double.parseDouble(args[0]);
        double montantRetrait = Double.parseDouble(args[1]);

        CompteBancaire compte = new CompteBancaire(soldeInitial);
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable tache = () -> {
            String nomThread = Thread.currentThread().getName();
            compte.retirer(montantRetrait);
            System.out.println(nomThread + " a retiré " + montantRetrait);
        };

        executor.execute(tache);
        executor.execute(tache);

        executor.shutdown();

        System.out.println("Solde final : " + compte.getSolde());
    }
}

class CompteBancaire {
    private double solde;
    private Lock lock = new ReentrantLock();

    public CompteBancaire(double soldeInitial) {
        this.solde = soldeInitial;
    }

    public void retirer(double montant) {
        lock.lock();
        try {
            if (solde >= montant) {
                solde -= montant;
            } else {
                System.out.println("Solde insuffisant");
            }
        } finally {
            lock.unlock();
        }
    }

    public double getSolde() {
        return solde;
    }
}
