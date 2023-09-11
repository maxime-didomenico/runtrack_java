import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.Executors;

public class CallableFutureExercice implements Callable<Integer> {

    private int a;
    private int b;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        CallableFutureExercice callableEx = new CallableFutureExercice(a, b);
        Future<Integer> future = executorService.submit(callableEx);
        int result = future.get();

        System.out.println(result);
        executorService.shutdown();
    }

    public CallableFutureExercice(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Integer call() {
        return a * b;
    }
}
