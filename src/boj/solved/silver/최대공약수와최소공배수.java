package boj.solved.silver;

import java.util.Scanner;

/**
 * 문제번호: 2609
 */
public class 최대공약수와최소공배수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOne = sc.nextInt();
        int numberTwo = sc.nextInt();

        System.out.println(minNum(numberOne, numberTwo));
        System.out.println(maxNum(numberOne, numberTwo));
    }

    public static int minNum(int numberOne, int numberTwo) {
        if (numberTwo == 0) {
            return numberOne;
        } else {
            return minNum(numberTwo, numberOne % numberTwo);
        }
    }

    public static int maxNum(int numberOne, int numberTwo) {
        return (numberOne * numberTwo) / minNum(numberOne, numberTwo);
    }
}
