public class Tagesabschnitt {

    public static void main(String[] args) {


        int tageszeit = 10;


    }


    public static void getTagesabschnitt(int tageszeit) {
        if (tageszeit > 5 && tageszeit < 10) {
            System.out.println("Morgens");
        } else if (tageszeit > 9 && tageszeit < 13) {
            System.out.println("Vormittag");
        } else if (tageszeit > 12 && tageszeit < 17) {
            System.out.println("Nachmittag");
        } else if (tageszeit > 16 && tageszeit < 21) {
            System.out.println("Abend");
        } else {
            System.out.println("Nacht");
        }
    }

    public static void getTagesabschnitt1(int tageszeit) {
        String tagesabschnitt;

        if (tageszeit < 6 || tageszeit >= 20) {
            tagesabschnitt = "Nacht";
        } else if (tageszeit < 10) {
            tagesabschnitt = "Morgens";
        } else if (tageszeit < 13) {
            tagesabschnitt = "Vormittag";
        } else if (tageszeit < 17) {
            tagesabschnitt = "Nachmittag";
        } else {
            tagesabschnitt = "Abend";
        }

        System.out.println(tagesabschnitt);
    }

    public static void getTagesabschnitt2(int tageszeit) {
        String tagesabschnitt = "Abend";

        if (tageszeit < 6 || tageszeit >= 20) {
            tagesabschnitt = "Nacht";
        } else if (tageszeit < 10) {
            tagesabschnitt = "Morgens";
        } else if (tageszeit < 13) {
            tagesabschnitt = "Vormittag";
        } else if (tageszeit < 17) {
            tagesabschnitt = "Nachmittag";
        }

        System.out.println(tagesabschnitt);
    }

    public static String getTagesabschnitt3(int tageszeit) {
        if (tageszeit < 6 || tageszeit >= 20) {
            return "Nacht";
        } else if (tageszeit < 10) {
            return "Morgens";
        } else if (tageszeit < 13) {
            return "Vormittag";
        } else if (tageszeit < 17) {
            return "Nachmittag";
        } else {
            return "Abend";
        }
    }
}
