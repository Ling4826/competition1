public class TowerOfhanoi {
    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, 1, 3, 2);
    }

    private static void towerOfHanoi(int count, int needle1, int needle3, int needle2) {
        if (count > 0){
            towerOfHanoi(count-1, needle1, needle2, needle3);
            System.out.println("Move disk " + count + " from needle " + needle1 + " to needle " + needle3 + ". ");
            towerOfHanoi(count-1, needle2, needle3, needle1);
        }
    }
}
