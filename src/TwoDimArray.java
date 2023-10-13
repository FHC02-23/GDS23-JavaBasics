public class TwoDimArray {

    public static void main(String[] args) {


        int[][] dimArray = new int[2][3];
        dimArray[0][0] = 1;
        dimArray[0][1] = 4;
        dimArray[0][2] = 5;
        dimArray[1][0] = 3;
        dimArray[1][1] = 2;
        dimArray[1][2] = 5;


        int[][] dimArray2 = {
                {1, 4},
                {3, 2}
        };

        for (int i = 0; i < dimArray2.length; i++) {
            for (int j = 0; j < dimArray2[i].length; j++) {
                System.out.print(dimArray2[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
