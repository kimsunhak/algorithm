package boj.StepByStep.정렬;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 문제번호 : 2750
 */
public class 수정렬하기 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arrays = new int[n];

        for (int i=0; i<n; i++) {
            arrays[i] = sc.nextInt();
        }

        Arrays.sort(arrays);

        for (int array : arrays) {
            System.out.println(array);
        }
    }
}
