package boj.StepByStep.forEach;

import java.util.Scanner;

/**
 * 문제번호 : 8393
 */
public class 합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        // 시간복잡도 O(n)
        int sum = 0;
        for (int i=1; i<=n; ++i) {
            sum += i;
        }
        System.out.print(sum);

        // 시간복잡도 O(1)
        int sum2 = (n * (n+1) / 2);
        System.out.print(sum2);

    }
}
