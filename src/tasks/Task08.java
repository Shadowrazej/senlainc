package tasks;

/**
 * Нужно ли включать длину последовательноести N <= 100?
 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N: ");
        int N = scanner.nextInt();
        ArrayList<Integer> palindromeList = new ArrayList<Integer>();

        if (N < 0 || N > 100) {
            throw new InputMismatchException("error");
        }

        for (int i = 0; i < N; i++) {
            if (isPalindrome(String.valueOf(i))) {
                palindromeList.add(i);
            }
        }

        for (int output : palindromeList) {
            System.out.print(output + " ");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String number) {
        StringBuilder reverse = new StringBuilder(number).reverse();
        String stringReverse = reverse.toString();
        if (number.equalsIgnoreCase(stringReverse)) return true;
        else return false;
    }

}
