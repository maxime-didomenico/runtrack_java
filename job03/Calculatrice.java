import java.util.Scanner;

public class Calculatrice {
    public static void main(String[] args) {
        Calc calc = new Calc();
        Scanner scan = new Scanner(System.in);
        float a, b;

        System.out.println("Entrez le premier nombre:");
        a = scan.nextFloat();
        System.out.println("Entrez le deuxième nombre:");
        b = scan.nextFloat();
        calc.add(a, b);
        calc.diff(a, b);
        calc.prod(a, b);
        calc.div(a, b);
    }  
}

class Calc {
    public void add(float a, float b) {
        System.out.println("Addition: " + (a + b));
    }

    public void diff(float a, float b) {
        float buff = a - b;

        if (buff < 0) {
            buff *= -1;
        }

        System.out.println("Différence: " + buff);
    }

    public void prod(float a, float b) {
        System.out.println("Produit: " + (a * b));
    }

    public void div(float a, float b) {
        System.out.println("Division: " + (a / b));
    }
}