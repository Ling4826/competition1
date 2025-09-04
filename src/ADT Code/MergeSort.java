import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10000);
        }

        System.out.println("Before sorting: ");
        printArray(numbers);

        mergeSort(numbers);

        System.out.println("\nAfter sorting: ");
        printArray(numbers);
    }

    private static void mergeSort(int[] inputArray) {
        int inputLength = inputArray.length;

        // base case
        if (inputLength < 2) {
            return;
        }
        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = inputArray[i];
        }
        for (int i = midIndex; i < inputLength; i++) {
            rightHalf[i - midIndex] = inputArray[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(inputArray, leftHalf, rightHalf);

    }

    private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int l = 0, r = 0, o = 0;

        while (l < leftSize && r < rightSize) {
            if (leftHalf[l] <= rightHalf[r]) {
                inputArray[o] = leftHalf[l];
                l++;
            } else {
                inputArray[o] = rightHalf[r];
                r++;
            }
            o++;
        }

        while (l < leftSize) {
            inputArray[o] = leftHalf[l];
            l++;
            o++;
        }
        while (r < rightSize) {
            inputArray[o] = rightHalf[r];
            r++;
            o++;
        }
    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

}
