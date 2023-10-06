public class SchleifenDemo {

    public static void main(String[] args) {


        int counter = 0;

        while (counter < 10) {
            System.out.println("Counter: " + counter);
            //counter ++;
            counter = counter + 1;
        }

        boolean t = true;
        while (t) {
            System.out.println("true");
            t = false;
        }


    }
}
