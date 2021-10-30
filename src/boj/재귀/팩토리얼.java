package boj.재귀;

import java.util.Scanner;

/**
 * 문제번호 : 10872
 */

public class 팩토리얼 {
    public static int factory(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factory(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = factory(sc.nextInt());
        System.out.println(n);
    }
}
