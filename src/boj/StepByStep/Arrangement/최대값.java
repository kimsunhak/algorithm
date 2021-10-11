package boj.StepByStep.Arrangement;

import java.util.Arrays;
import java.util.Scanner;


/**
 * 문제 번호 : 2562
 */
public class 최대값 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[9];
        int max = 0;
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            if (max < array[i]) {
                max = array[i];
                index = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(index);
    }
}
//3, 29, 38, 12, 57, 74, 40, 85, 61
