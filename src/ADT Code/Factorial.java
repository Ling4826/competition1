import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        System.out.println("Its factorial is " + factorial(n));
        input.close();
    }

    private static int factorial(int n) {
        int fact;
        if (n > 1)
            fact = factorial(n - 1) * n;
        else
            fact = 1;

        return fact;
    }

}
