package boj.StepByStep.while문;

import java.util.Scanner;

/**
 * 문제번호 : 10952
 */
public class AB5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == 0 && b == 0) {
                break;
            }

            System.out.println(a+b);
        }
    }
}
