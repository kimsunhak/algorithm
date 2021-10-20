package boj.StepByStep.while문;

import java.util.Scanner;

/**
 * 문제 번호 : 1110
 */
public class 더하기사이클 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int answer = n;
        int count = 0;
        do {
            int left = answer / 10;
            int right = answer % 10;
            answer = right * 10 + (left + right) % 10;
            count++;
        } while (n != answer);

        System.out.println(count);
    }
}
