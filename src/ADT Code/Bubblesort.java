import java.util.Random;

public class Bubblesort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];

        // Assign random integer to the array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000);
        }

        System.out.println("Before sorting: ");
        printArray(numbers);

        bubbleSort(numbers);

        System.out.println("\nAfter sorting: ");
        printArray(numbers);

    }

    private static void bubbleSort(int[] numbers) {
        boolean swapped = true;

        while (swapped) {
            swapped = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    swapped = true;
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }
    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

}
