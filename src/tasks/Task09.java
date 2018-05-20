package tasks;

/**
 * Нужно ли включать длину последовательноести N <= 100?
 * Длину последовательности принял N < 100.
 */

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N: ");
        int N = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < N; i += 2) {
            System.out.print(i + " ");
            sum += i;
        }

        System.out.println("\nSum of even numbers: " + sum);

        scanner.close();
    }
}
