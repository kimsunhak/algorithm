package boj.왕초보;

import java.util.Scanner;

/**
 * 문제번호 : 10093
 */

public class 숫자 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        if (a > b) {
            System.out.println(a-b-1);
            for (long i=b+1; i<a; i++) {
                System.out.print(i + " ");
            }
        } else if (a < b) {
            System.out.println(b-a-1);
            for (long i=a+1; i<b; i++) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println(0);
        }
    }
}
