public class BinarySearchRecusive {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Found at location: " + binarySearchRecusive(30, numbers, 0, numbers.length-1));
    }

    private static int binarySearchRecusive(int target, int[] a, int first, int last) {
        int mid = (first + last) / 2;
        if (first > last) 
            return -1;{
        if (target == a[mid])
            return mid;
        else if (target < a[mid])
            return binarySearchRecusive(target, a, first, mid - 1);
        else // if(target > a[mid])
            return binarySearchRecusive(target, a, mid + 1, last);
        }
    }
}
