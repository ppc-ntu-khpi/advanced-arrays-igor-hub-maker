# Практична робота "Поглиблене використання масивів"

## Завдання: 
Знайти друге за величиною число у матриці розміром N x M 

## Код: 
Метод який виконує завдання
```
public static int GetSecondBiggestFromMatrix(int[][] matrix) {
    int[] nums = Arrays.stream(matrix)
            .flatMapToInt(Arrays::stream)
            .distinct() // Видаляємо дублікати
            .sorted() // Сортуємо числа у порядку зростання
            .toArray();
    return nums[nums.length - 2];
}
```

Весь інший код знаходиться в теці [src](/src/)