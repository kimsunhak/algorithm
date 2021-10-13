package boj.StepByStep.forEach;

import java.util.Scanner;

/**
 * 문제번호 : 10871
 */
public class X보다작은수 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] array = new int[n];

        for (int i=0; i<n; i++) {
            array[i] = sc.nextInt();
        }

        for (int i=0; i<n; i++) {
            if (array[i] < x) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
