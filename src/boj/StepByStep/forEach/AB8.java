package boj.StepByStep.forEach;

import java.util.Scanner;


/**
 * 문제번호 : 11022
 */
public class AB8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Case #" + i + ": "+ a + " + " + b + " = " + (a+b));
        }
    }
}
