public class DemoApp {

    public static void main(String[] args) {

        int counter = 0;
        System.out.println("Schleifenstart");
        while (counter < 21) {
            System.out.println("Start Code für Schleife");

            counter++;

            if (counter > 10) {
                // continue;
                // break;
                return;
            }

            System.out.println("Ende Code für Schleife");
        }

        System.out.println("Methoden Ende");

    }
}
