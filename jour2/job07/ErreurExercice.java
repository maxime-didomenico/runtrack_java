public class ErreurExercice {

    public static void main(String[] args) {
        try {
            
            if (args.length < 2 || args.length > 2) {
                if (args[0] == null || args[1] == null) {
                    throw new MyException("NullPointerException.");
                }
                else {
                    throw new MyException("ArrayIndexOutOfBoundsException.");
                }
            }

            float a = Float.parseFloat(args[0]);
            float b = Float.parseFloat(args[1]);

            if (b == 0) {
                throw new MyException("ArithmeticException.");
            }

            double c = a / b;

            System.out.println(a + " / " + b + " = " + c);
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