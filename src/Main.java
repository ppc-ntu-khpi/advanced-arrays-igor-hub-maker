
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        Random rand = new Random();

        for (int[] row : matrix) {
            Arrays.setAll(row, i -> rand.nextInt(51));
        }

        for (int[] row : matrix)
            System.out.println(Arrays.toString(row));

        var result = Worker.GetSecondBiggestFromMatrix(matrix);
        System.err.println("second max rom matrix is: " + result);
    }
}
