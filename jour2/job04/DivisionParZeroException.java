public class DivisionParZeroException {

    public static void main(String[] args) {
        try {
            float a = Float.parseFloat(args[0]);
            float b = Float.parseFloat(args[1]);

            if (b == 0) {
                throw new MyException("Division par zéro impossible.");
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