package boj.StepByStep.기본수학1;

import java.util.Scanner;

/**
 * 문제번호 : 2292
 */

public class 벌집 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
		int i = 1;

		while(true) {
			count++;
			if (i < n) {
				i += 6 * count;
			} else {
				break;
			}
		}

		System.out.println(count);
    }
}
