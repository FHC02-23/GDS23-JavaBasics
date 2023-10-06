public class ScopeDemo {

    public static void main(String[] args) {
        int a = 1;

    }

    public static void scope(int a) {
        int b = 2;

        // Neuer Bereich innerhalb von scope
        {
            int c = 3;
            System.out.println(c);
            System.out.println(b);
        }
        // Neuer Bereich
        {
            int c = 4;
        }

        // ausserhalb der Kenntnis von c
        //System.out.println(c);
        System.out.println(b);
        System.out.println(a);
    }
}
