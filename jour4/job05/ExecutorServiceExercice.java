import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExercice {
    public static void main(String[] args) throws Exception {
        int factor = Integer.parseInt(args[0]);
        int i = 1;

        ExecutorService executor = Executors.newFixedThreadPool(3);

        while (i <= 3) {
            int buff = i;
            Future<Integer> future = executor.submit(() -> buff * factor);
            System.out.println("Résultat de la tâche " + buff + ": " + future.get());
            i++;
        }

        executor.shutdown();
    }
}
