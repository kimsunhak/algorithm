package boj.StepByStep.Arrangement;

import java.util.Scanner;

/**
 * 문제 번호 : 2577
 */
public class 숫자의개수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        int[] index = new int[10];

        String input = String.valueOf(a * b * c);

        for (int i=0; i<input.length(); i++) {
            index[input.charAt(i) - '0']++;
        }

        for (int i=0; i<index.length; i++) {
            System.out.println(index[i]);
        }
    }
}
