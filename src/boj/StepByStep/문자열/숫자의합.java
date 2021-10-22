package boj.StepByStep.문자열;

import java.util.Scanner;

/**
 * 문제 번호 : 11720
 */
public class 숫자의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String number = sc.next();

        int sum = 0;

        for (int i=0; i<n; i++) {
            sum += number.charAt(i) - '0';
        }

        System.out.println(sum);
    }
}
