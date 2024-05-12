import java.util.Arrays;

public class Worker {
    public static int GetSecondBiggestFromMatrix(int[][] matrix) {
        int[] nums = Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .distinct() // Видаляємо дублікати
                .sorted() // Сортуємо числа у порядку зростання
                .toArray();
        return nums[nums.length - 2];
    }
}
