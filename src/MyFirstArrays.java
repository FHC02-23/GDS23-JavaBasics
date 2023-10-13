public class MyFirstArrays {

    public static void main(String[] args) {

        String[] names = new String[2];
        names[0] = "Max";
        names[1] = "Susi";

        String[] names2 = {"Max", "Susi"};

        // Gib den zweiten Namen von names aus
        System.out.println(names[1]);

        // Gib den ersten Namen aus
        System.out.println(names[0]);

        // Gib den dritten Namen aus --> !!!! ERROR
        // System.out.println(names[2]);

        int[] array1 = new int[2];
        array1[0] = 3;
        array1[1] = 4;

        int[] array2 = {7, 1};

        // addieren der ersten beiden Elemente
        int resultat = array1[0] + array2[0];

        int[] zahlen1 = {3, 4, 5};
        int[] zahlen2 = {7, 1, 3};

        System.out.println(zahlen1.length);

        System.out.println("Schreibe alle Zahlen auf die Konsole");
        for (int i = 0; i < zahlen1.length; i++) {
            System.out.println("Zahl: " + zahlen1[i]);
        }

        // addiere alle Zahlen
        for (int n = 0; n < zahlen1.length; n++) {
            int result = zahlen1[n] + zahlen2[n];
            System.out.println("result = " + result);
        }

        for (int n = 0; n < zahlen1.length && n < zahlen2.length; n++) {
            int result = zahlen1[n] + zahlen2[n];
            System.out.println("result = " + result);
        }

    }
}
