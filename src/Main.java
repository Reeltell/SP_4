import java.util.Scanner;

class MultiplicationMethods {

    // Метод для умножения через сложение
    public static int multiplyUsingAddition(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        return result;
    }

    // Метод для умножения через сдвиг битов
    public static int multiplyUsingBitShift(int a, int b) {
        int result = 0;
        while (b > 0) {
            if ((b & 1) == 1) {
                result += a;
            }
            a <<= 1; // Умножаем a на 2
            b >>= 1; // Делим b на 2
        }
        return result;
    }

    // Метод для умножения через рекурсию
    public static int multiplyUsingRecursion(int a, int b) {
        if (b == 0) return 0;
        return a + multiplyUsingRecursion(a, b - 1);
    }

    // Метод для умножения через массив
    public static int multiplyUsingArray(int a, int b) {
        int[] results = new int[b];
        for (int i = 0; i < b; i++) {
            results[i] = a;
        }
        int sum = 0;
        for (int value : results) {
            sum += value;
        }
        return sum;
    }

    // Метод для умножения через циклы
    public static int multiplyUsingLoops(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число (a): ");
        int a = scanner.nextInt();

        System.out.println("Введите второе число (b): ");
        int b = scanner.nextInt();

        System.out.println("Выберите способ умножения:");
        System.out.println("1. Сложение");
        System.out.println("2. Сдвиг битов");
        System.out.println("3. Рекурсия");
        System.out.println("4. Массив");
        System.out.println("5. Циклы");

        int choice = scanner.nextInt();

        int result = 0;

        switch (choice) {
            case 1:
                result = multiplyUsingAddition(a, b);
                break;
            case 2:
                result = multiplyUsingBitShift(a, b);
                break;
            case 3:
                result = multiplyUsingRecursion(a, b);
                break;
            case 4:
                result = multiplyUsingArray(a, b);
                break;
            case 5:
                result = multiplyUsingLoops(a, b);
                break;
            default:
                System.out.println("Неверный выбор.");
                return;
        }

        System.out.println("Результат умножения " + a + " и " + b + " равен: " + result);
    }
}