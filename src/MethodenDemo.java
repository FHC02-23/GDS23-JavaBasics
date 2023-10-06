public class MethodenDemo {

    public static void main(String[] args) {

        printName("Max Mustermann");
        printName("Susi Sorglos");
        printName("John Doe");
        printName("Fr. Mustermann");
        printName("Hr. Mustermann");

        printName("Max", "Mustermann");
        printName(1234);


        // rufe returnName auf und speichere den Wert
        String max = returnName("Max", "Mustermann");
        printName(max);

        // 2. Möglichkeit
        printName(returnName("Susi", "Sorglos"));
    }

    public static void printName(String name) {
        System.out.println(name);
    }

    public static void printName(int xyz) {
        System.out.println(xyz);
    }


    public static void printName(String firstName, String lastName) {
        System.out.println(firstName + " " + lastName);
    }

    public static String returnName(String firstName, String lastName) {
        return "Mein Name: " + firstName + " " + lastName;
    }


}
