import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        for (int i = 1; i < n + 1; i++) {
            // System.out.println("Its fibonacci value 0f " + i + " is " + fibonacci(n));
            System.out.print(fibonacci(i) + " ");
        }
        input.close();
    }

    private static int fibonacci(int n) {
        int fib;
        if (n > 2)
            fib = fibonacci(n - 1) + fibonacci(n - 2);
        else if (n == 2)
            fib = 1;
        else
            fib = 0;
        return fib;
    }
}
