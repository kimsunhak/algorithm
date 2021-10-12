package boj.왕초보;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 문제 번호 : 2752
 */
public class 세수정렬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[3];

        for (int i=0; i<array.length; i++) {
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);

        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
