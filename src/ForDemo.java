public class ForDemo {

    public static void main(String[] args) {

        // Gib die Werte von 1 bis inkl. 10 auf der Konsole aus

        // Unter Verwendung von while
        System.out.println("While: ");
        int i = 1;  // initialer Wert
        while (i <= 10) {
            System.out.println("Durchlauf: " + i);
            i = i + 1; // i++
        }

        System.out.println();
        System.out.println("For:");

        // Unter Verwendung von for
        for (int j = 1; j <= 10; j++) {
            System.out.println("Durchlauf: " + j);
        }



        // VORSICHT - ENDLOSSCHLEIFE
        //for (;;) {
        //    System.out.println("for schleife");
        //}


        // zähle von 10 herunter
        for (int k = 10; k >= 0; k--) {
            System.out.println("k = " + k);
        }

        // 20 beginnen
        // bis inkl. 90 zählen
        // und nur jeden 5 Wert auf der Konsole ausgeben
        // => 20, 25, 30, 35 etc.
        for (int start = 20; start <= 90; start = start + 5) {
            System.out.println(start);
        }

    }
}
