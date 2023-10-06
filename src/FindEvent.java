public class FindEvent {

    public static void main(String[] args) {

        int input = 1;
        // solange input <= 10
        while (input <= 10) {
            // prüfe ob input == gerade (modulo)
            if (input % 2 == 0) {
                System.out.println("Gerade Zahl: " + input);
            }
            // erhöhe unbedingt den input !!!!!!!!!!
            input++;
        }
    }
}
