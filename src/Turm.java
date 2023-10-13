public class Turm {


    public static void main(String[] args) {
        // zähle von 1 bis 10 hinauf
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }

        // zähle von 10 hinunter bis inkl 1
        for (int j = 10; j > 0; j--) {
            System.out.println(j);
        }

        System.out.println("Hinauf zählen mit Methode");
        zaehleHinaufBis(5);

        zaehleHinaufBis(20);
    }

    public static void zaehleHinaufBis(int hoechstwert) {
        for (int i = 1; i <= hoechstwert; i++) {
            System.out.println(i);
        }
    }
}
