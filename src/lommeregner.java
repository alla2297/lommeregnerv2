import java.util.Scanner;

public class lommeregner {
    public static void main(String[] args) {
        System.out.println("Brug lomme regner ");
        Scanner scanner = new Scanner(System.in);


            System.out.println("Indtast et tal: ");
            double x = scanner.nextDouble();

            System.out.println("Indtast endnu et tal: ");
            double y = scanner.nextDouble();


            System.out.println("Hvordan vil du regne med det nye tal? Skriv +, -, / eller *");
            String symbol = scanner.next();

            if (symbol.equals("+")) {
                System.out.println("result = " + (x + y));
            }
            if (symbol.equals("-")) {
                System.out.println("result = " + (x - y));

            }
            if (symbol.equals("*")) {
                System.out.println("result = " + (x * y));
            }
            if (symbol.equals("+")) {
                System.out.println("result = " + (x + y));
            }

    }
}

