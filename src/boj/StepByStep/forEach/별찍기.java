package boj.StepByStep.forEach;

import java.util.Scanner;

/**
 * 문제 번호 : 2438
 */
public class 별찍기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
