public class BinarySearch {
    public static void main(String[] args) {
        int[] ints = { 1, 2, 4, 5, 7, 9, 11 };

        System.out.println("index of target: " + binarySearch(ints, 0));

    }

    private static int binarySearch(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;

        while (low <= high) {
            int midpoint = low + (high - low) / 2;
            int mid = numbers[midpoint];

            if (target == mid) {
                return midpoint;
            }
            if (target < mid) {
                high = midpoint - 1;
            } else {
                low = midpoint + 1;
            }

        }
        return -1;
    }

}
