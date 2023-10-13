public class TemperaturRechner {


    public static void main(String[] args) {

        double temp1 = 11;
        double temp2 = 22;

        double fahrenheit1 = fahrenheitBerechner(temp1);
        double fahrenheit2 = fahrenheitBerechner(temp2);
        double fahrenheit3 = fahrenheitBerechner(40);
        System.out.println(fahrenheit1);
        System.out.println(fahrenheit2);
        System.out.println(fahrenheit3);

        // init counter
        int temp = -10;
        while (temp <= 40) {
            // codeteil für die schleife
            double res = fahrenheitBerechner(temp);
            System.out.println("res = " + res);
            temp++; // temp = temp + 1;
        }

        // for
        for (int t = -10; t <= 40; t++) {
            // rufe fahrenheitBerechner auf und gib das Resultat auf der Konsole aus
            System.out.println("fahrenheit: " + fahrenheitBerechner(t));
        }

    }

    public static double fahrenheitBerechner(double temp) {
//        double fahrenheit1 = (temp * 9 / 5) + 32;
//        return fahrenheit1;

        return (temp * 9 / 5) + 32;
    }
}
