public class ArithmetischeOperationen {

    public static void main(String[] args) {
        // deklarieren und initialisieren
        int a = 3;
        int b = 2;
        int result;

        // addieren
        result = a + b;
        System.out.println("result addition = " + result);

        System.out.println("result sub = " + (a - b));
        System.out.println("result multi = " + (a * b));
        System.out.println("result div = " + (a / b));
        System.out.println("result modulo = " + (a % b));

        // division durch 0 nicht möglich
        //System.out.println(3/0);

        double div = a / (b * 1.0);
        System.out.println("div = " + div);

        System.out.println();
        System.out.println("a = " + a);
        System.out.println(a++); // erwartung 3
        // andere Schreibweise
        // a = a + 1
        System.out.println("a = " + a);

        System.out.println(++a); // erwartung 5
        System.out.println("a = " + a);



        String haus1 = "Haus";
        String haus2 = "Haus";
        System.out.println(haus1 == haus2);

        String name1 = new String("Name");
        String name2 = new String("Name");
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));

    }
}
