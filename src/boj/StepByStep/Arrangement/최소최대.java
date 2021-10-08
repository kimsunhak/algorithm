package boj.StepByStep.Arrangement;

import java.util.Arrays;
import java.util.Scanner;


/**
 * 문제 번호 : 10818
 */
public class 최소최대 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i=0; i<n; i++) {
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);
        System.out.print(array[0] + " " + array[n - 1]);
    }
}
