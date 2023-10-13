public class Calculator {

    public static void main(String[] args) {
        /*
         * Variablen deklarieren
         * und initialisieren
         */

        String name = "MyCalculator";
        int a = 2;
        int b = 3;
        //int result;

        // addieren
        // ergebnis in result speichern
        int result = a + b;

        // STRG + ALT + V => variable generiert
        int result1 = a + b;

//        System.out.println("Mein Name ist: " + name);
//        System.out.println("a: " + a); // STRG + D
//        System.out.println("b: " + b); // STRG + D
//        System.out.println("result = " + result); // soutv + tab

        int res = add(1, 2);
        printResult(res);

        res = subtract(3, 2);
        printResult(res);

        printResult(multiply(3, 2));

        printResult(divide(3,2));
        printResult(divide(3, 0));
        printResult(mod(3, 2));

        int[] numbers = {1, 2, 3, 4};
        int resultOfSum = sum(numbers); // STRG + v
        printResult(resultOfSum);

    }

    public static int add(int input1, int input2) {
        System.out.println("Input 1: " + input1);
        System.out.println("Input 2: " + input2);
        int result = input1 + input2;

        //System.out.println("Ergebnis: " + result);
        System.out.println("Ergebnis: " + (input1 + input2));
        return result;

        // 2. Möglichkeit
        // direkt das Ergebnis retour liefern
        //return input1 + input2;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(int a, double divisor) {
        // cast to double
        // 1. Möglichkeit --> beide input parameter sind int
        //double result = a / (divisor * 1.0);
        // return result

        // 2. Möglichkeit
        // Parameter zu double ändern

        if (divisor == 0) {
            return 0;
        }

        return a / divisor;

    }

    public static double divide2(int a, double divisor) {
        double result;

        if (divisor == 0) {
            result = 0;
        } else {
            result = a / divisor;
        }

        return result;
    }

    public static double divide3(int a, double divisor) {
        double result = 0;

        if (divisor != 0) {
            result = a / divisor;
        }

        return result;
    }

    public static int mod(int a, int b) {
        return a % b;
    }

    public static void printResult(double result) {
        System.out.println("Das Ergebnis lautet: " + result);
    }

    public static int sum(int[] numbers) {
        int res = 0;
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            res = res + number;
        }

        return res;
    }
}
