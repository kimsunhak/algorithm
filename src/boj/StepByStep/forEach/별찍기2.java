package boj.StepByStep.forEach;

import java.util.Scanner;

/**
 * 문제번호 : 2439
 */

public class 별찍기2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for (int j=n; j>n-i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
