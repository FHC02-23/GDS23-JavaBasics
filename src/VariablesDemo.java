public class VariablesDemo {

    public static void main(String[] args) {
        // Variablen deklarieren
        String firstName;
        long l;
        int a, b, c;

        // geht nicht, da init fehlt
        //System.out.println(a);

        // variable initialisieren
        a = 1;
        b = 2;
        c = 3;
        l = 5;
        firstName = "Max";

        // Deklaration + Initialisierung
        int d = 4;
        String lastName = "Mustermann";

        int p = 3, q = 7;

        firstName = "Markus";

        // Datentyp tauschen nicht möglich
        // firstName = 1;


        l = a;

        System.out.println(firstName);
        System.out.println(l);
        System.out.println(q);

        // var Datentyp

        var binEinVarInt = 200;
        var binEinVarString = "var als String";

    }
}
