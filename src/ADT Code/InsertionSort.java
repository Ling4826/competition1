import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("Before: ");
        printArray(numbers);

        insertionSort(numbers);

        System.out.println("\nAfter: ");
        printArray(numbers);
    }

    private static void insertionSort(int[] input) {
        for (int i = 1; i < input.length; i++) {
            int current = input[i];
            int j = i - 1;
            // loop back and shift
            while (j >= 0 && input[j] > current) {
                input[j + 1] = input[j];
                j--;
            }
            input[j + 1] = current;
        }
    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
    
}
