package boj.StepByStep.Arrangement;

import java.util.Scanner;

/**
 * 문제 번호: 4344
 */
public class 평균은넘겠지 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        for (int i=0; i<testCase; i++) {
            int n = sc.nextInt(); // 학생 수
            int[] array = new int[n];

            double sum = 0;
            double count = 0;

            for (int j=0; j<n; j++) {
                array[j] = sc.nextInt();
                sum += array[j];
            }
            for (int j=0; j<n; j++) {
                if (sum /n < array[j]) {
                    count++; // 평균보다 큰 학생수
                }
            }
            System.out.printf("%.3f", count / n * 100);
            System.out.println("%");
        }
    }
}
