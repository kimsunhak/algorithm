package boj.StepByStep.기본수학1;

import java.util.Scanner;

/**
 * 문제번호 : 1712
 */
public class 손익분기점 {
    public static void main(String[] args) {

        // (n x 상품가격) = 불변비옹 + (n x 가변비용)
        // A + Bx < Cx = A/(C-B) < x

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (c <= b) {
            System.out.println("-1");
        } else {
            System.out.println((a / (c - b)) + 1);
        }
    }
}
